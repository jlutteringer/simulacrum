package alloy.simulacrum.api.config

import alloy.simulacrum.api.user.SimUserDetailsService
import alloy.simulacrum.api.user.User
import alloy.simulacrum.api.user.UserDTO
import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
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
                .antMatchers(
                        "/error"
                ).permitAll()
                .antMatchers("/admin/**", "/actuator/**").hasAnyRole("ROLE_ADMIN")
                .anyRequest().authenticated().and()
                .exceptionHandling().accessDeniedHandler(OAuth2AccessDeniedHandler()).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
    }

    @Bean
    fun principalExtractor(userDetailsService: SimUserDetailsService): PrincipalExtractor {
        return PrincipalExtractor { map ->
            val email = map!!["email"] as String
            var user = userDetailsService.loadUserByUsername(email) as User?
            if (user == null) {
                val userDto = UserDTO(email)
                user = userDetailsService.registerUser(userDto)
            }
            user
        }
    }
}