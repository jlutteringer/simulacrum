package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import mu.KLogging
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/api/campaign")
class CampaignController(val campaignService: CampaignService) {
    companion object : KLogging()

    @GetMapping()
    fun getGames(@AuthenticationPrincipal user: User): List<CampaignSummaryDTO> {
        var campaigns =  campaignService.findAllActiveCampaigns(user)
        return campaigns
    }

    @GetMapping("/{campaignId}")
    fun getGame(@AuthenticationPrincipal user: User, @PathVariable campaignId: Long): CampaignDTO {
        return campaignService.findCampaign(campaignId)
    }

    @PostMapping()
    fun createGame(@AuthenticationPrincipal user: User, @RequestBody campaignSummaryDTO: CampaignSummaryDTO): CampaignSummaryDTO {
        return campaignService.save(user, campaignSummaryDTO)
    }

    @DeleteMapping()
    fun archiveGame(@AuthenticationPrincipal user: User, @RequestBody campaignSummaryDTO: CampaignSummaryDTO) {
        campaignService.archive(user, campaignSummaryDTO)
    }

    @MessageMapping("/campaign/{campaignId}")
    @SendTo("/api/topic/campaign/{campaignId}")
    fun campaignAction(@AuthenticationPrincipal user: User, @DestinationVariable campaignId: Long, campaignAction: CampaignActionDTO): CampaignActionDTO {
        // TODO filter actions?
        logger.info("Action recieved: $campaignAction")
        campaignAction.userId = user.id.value
        return campaignAction
    }
}