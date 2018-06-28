package alloy.simulacrum.api.game

import alloy.simulacrum.api.Pageable
import alloy.simulacrum.api.RestUtils
import alloy.simulacrum.api.user.User
import mu.KLogging
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.security.access.prepost.PostAuthorize
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse

@RestController()
@RequestMapping("/api/campaigns")
class CampaignController(val campaignService: CampaignService) {
    companion object : KLogging()

    @GetMapping("/currentUser")
    fun getGames(@AuthenticationPrincipal user: User): List<CampaignSummaryDTO> {
        return campaignService.findAllActiveCampaigns(user)
    }

    @PostAuthorize("hasRole('ROLE_ADMIN') or (@campaignService.userCanAccess(#user, returnedObject))")
    @GetMapping("/{campaignId}")
    fun getGame(@AuthenticationPrincipal user: User, @PathVariable campaignId: Long): CampaignDTO {
        return campaignService.findCampaign(campaignId)
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping()
    fun getCampaigns(
            @AuthenticationPrincipal user: User,
            response: HttpServletResponse,
            @RequestParam range: String?,
            @RequestParam filter: String?,
            @RequestParam sort: String?
    ): List<CampaignDTO> {
        val campaign = campaignService.findAllCampaigns(Pageable(filter, range, sort))
        RestUtils.setHeaders(response, campaign)
        return campaign.entries
    }

    @PostMapping()
    fun createCampaign(@AuthenticationPrincipal user: User, @RequestBody campaignDTO: CampaignDTO): CampaignDTO {
        return campaignService.create(user, campaignDTO)
    }

    @PutMapping("/{campaignId}")
    fun updateCampaign(@AuthenticationPrincipal user: User, @PathVariable campaignId: Long, @RequestBody campaignDTO: CampaignDTO): CampaignDTO {
        return campaignService.update(user, campaignDTO)
    }

    @DeleteMapping("/{campaignId}")
    fun archiveCampaign(@AuthenticationPrincipal user: User, @PathVariable campaignId: Long) {
        campaignService.archive(user, campaignId)
    }

    @MessageMapping("/campaigns/{campaignId}")
    @SendTo("/api/topic/campaigns/{campaignId}")
    fun campaignAction(@AuthenticationPrincipal user: User, @DestinationVariable campaignId: Long, campaignAction: CampaignActionDTO): CampaignActionDTO {
        // TODO filter actions?
        logger.info("Action recieved: $campaignAction")
        campaignAction.userId = user.id.value
        return campaignAction
    }
}