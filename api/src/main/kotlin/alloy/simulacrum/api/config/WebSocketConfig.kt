package alloy.simulacrum.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.SimpMessageType
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry
import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import org.springframework.web.socket.config.annotation.StompEndpointRegistry
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer

@Configuration
class SocketSecurityConfig : AbstractSecurityWebSocketMessageBrokerConfigurer() {
    override fun sameOriginDisabled(): Boolean {
        return true
    }

    override fun configureInbound(messages: MessageSecurityMetadataSourceRegistry) {
        messages
                // message types other than MESSAGE and SUBSCRIBE
                .simpDestMatchers("/api/topic/**").authenticated()
                .simpDestMatchers("/api/app/**").authenticated()
                .simpDestMatchers("/api/socket").authenticated()
                .simpTypeMatchers(SimpMessageType.CONNECT, SimpMessageType.HEARTBEAT, SimpMessageType.UNSUBSCRIBE, SimpMessageType.DISCONNECT, SimpMessageType.MESSAGE, SimpMessageType.SUBSCRIBE).permitAll()
                // catch all
                .anyMessage().denyAll()
    }
}

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