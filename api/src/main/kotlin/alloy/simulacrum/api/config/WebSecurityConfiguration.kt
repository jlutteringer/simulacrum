package alloy.simulacrum.api.config

import alloy.simulacrum.api.user.SimUserDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.context.annotation.Bean
import org.springframework.security.authentication.AuthenticationProvider
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.JdbcUserDetailsManager
import javax.sql.DataSource
import org.springframework.http.CacheControl.maxAge
import org.springframework.web.cors.CorsConfiguration
import org.springframework.web.cors.CorsConfigurationSource
import org.springframework.web.cors.UrlBasedCorsConfigurationSource
import org.springframework.web.servlet.config.annotation.CorsRegistry



@EnableOAuth2Sso
@Configuration
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {

    @Autowired
    lateinit var userUserDetailsService: SimUserDetailsService

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
                .cors().configurationSource(corsConfigurationSource()).and()
                .csrf().disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.authenticationProvider(authenticationProvider())
    }

    @Bean
    fun corsConfigurationSource(): CorsConfigurationSource {
        val cors = UrlBasedCorsConfigurationSource()
        val config = CorsConfiguration()

        // TODO secure for production
        config.allowedOrigins = listOf("*")
        config.allowedMethods = listOf("GET, POST, OPTIONS")
        config.allowedHeaders = listOf("*")
        config.maxAge = 1800L

        cors.registerCorsConfiguration("/**", config)
        config.applyPermitDefaultValues()
        return cors
    }

    @Bean
    fun jdbcUserDetailsManager(dataSource: DataSource): JdbcUserDetailsManager {
        val jdbcUserDetailsManager = JdbcUserDetailsManager()
        jdbcUserDetailsManager.setDataSource(dataSource)
        return jdbcUserDetailsManager
    }

    @Bean
    fun encoder(): PasswordEncoder {
        return BCryptPasswordEncoder(11)
    }

    @Bean
    fun authenticationProvider(): AuthenticationProvider {
        var daoAuthenticationProvider = DaoAuthenticationProvider()
        daoAuthenticationProvider.setUserDetailsService(this.userUserDetailsService)
        daoAuthenticationProvider.setPasswordEncoder(encoder())
        return daoAuthenticationProvider
    }
}