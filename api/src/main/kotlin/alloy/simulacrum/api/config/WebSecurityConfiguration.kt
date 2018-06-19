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
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource

@EnableWebSecurity
@EnableResourceServer
@Configuration
class ResourceServiceConfigurer : ResourceServerConfigurerAdapter() {

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
                .csrf().disable()
                .cors().configurationSource(corsConfigurationSource()).and()
                .authorizeRequests().anyRequest().authenticated().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .logout().logoutSuccessUrl("/").permitAll().and()
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val cors = UrlBasedCorsConfigurationSource()
        val config = CorsConfiguration()
        // TODO How to secure for production?
        config.applyPermitDefaultValues()
        cors.registerCorsConfiguration("/**", config)
        return cors
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