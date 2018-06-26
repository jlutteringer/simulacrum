package alloy.simulacrum.api.config

import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.SimpMessageType
import org.springframework.security.config.annotation.web.messaging.MessageSecurityMetadataSourceRegistry
import org.springframework.security.config.annotation.web.socket.AbstractSecurityWebSocketMessageBrokerConfigurer


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
