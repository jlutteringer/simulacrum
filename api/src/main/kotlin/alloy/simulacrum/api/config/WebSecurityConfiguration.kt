package alloy.simulacrum.api.config

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@EnableOAuth2Sso
@Configuration
class WebSecurityConfiguration : WebSecurityConfigurerAdapter() {
    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
                .csrf()
                .disable()
                .antMatcher("/**")
                .authorizeRequests()
                .anyRequest()
                .authenticated()
    }
}