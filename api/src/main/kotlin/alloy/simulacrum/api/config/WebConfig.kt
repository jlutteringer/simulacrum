package alloy.simulacrum.api.config

import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.UserDTO
import alloy.simulacrum.api.user.UserService
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.joda.JodaModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.springframework.boot.autoconfigure.security.oauth2.resource.AuthoritiesExtractor
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler

@EnableWebSecurity
@EnableResourceServer
@Configuration
class ResourceServiceConfigurer : ResourceServerConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
                .csrf().disable()
                .headers().frameOptions().sameOrigin().and()
                .authorizeRequests()
                .antMatchers("/admin/**", "/actuator/**").hasAnyRole("ROLE_ADMIN")
                .anyRequest().authenticated().and()
                .exceptionHandling().accessDeniedHandler(OAuth2AccessDeniedHandler()).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }

    @Bean
    fun principalExtractor(userService: UserService): PrincipalExtractor {
        return PrincipalExtractor { map ->
            val email = map!!["email"] as String
            var user = userService.loadUserByUsername(email) as User?
            if (user == null) {
                val userDto = UserDTO(email)
                user = userService.registerUser(userDto)
            }
            user
        }
    }

    @Bean
    fun authoritiesExtractor(userService: UserService): AuthoritiesExtractor {
        return AuthoritiesExtractor { map ->
            val email = map!!["email"] as String
            userService.loadAuthoritiesForUser(email)
        }
    }

    @Bean
    fun objectMapper(): ObjectMapper =
            ObjectMapper()
                    .registerModule(JodaModule())
                    .registerModule(ParameterNamesModule())
                    .registerModule(Jdk8Module())
                    .registerModule(KotlinModule())
                    .configure(com.fasterxml.jackson.databind.SerializationFeature.
                            WRITE_DATES_AS_TIMESTAMPS , false)

}

@Configuration
class WebSecurityConfig : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity) {
        web.ignoring().antMatchers("/error**")
    }
}