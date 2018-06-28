package alloy.simulacrum.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import org.springframework.web.socket.config.annotation.StompEndpointRegistry
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer

@Configuration
@EnableWebSocketMessageBroker
class WebSocketConfig : WebSocketMessageBrokerConfigurer {

    override fun configureMessageBroker(config: MessageBrokerRegistry) {
        // Prefix the same as all @SendTo to which the user can subscribe
        config.enableSimpleBroker("/api/topic")

        // Prefixes all @MessageMapping to which messages are sent
        config.setApplicationDestinationPrefixes("/api/app")
        config.setUserDestinationPrefix("/api/users")
    }

    override fun registerStompEndpoints(registry: StompEndpointRegistry) {
        // TODO Why do we need allowed origins?
        // Users connect to this endpoint with SockJS
        registry.addEndpoint("/api/socket").setAllowedOrigins("*").withSockJS()
    }

}