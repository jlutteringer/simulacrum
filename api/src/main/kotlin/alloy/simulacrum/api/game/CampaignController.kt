package alloy.simulacrum.api.game

import alloy.simulacrum.api.user.User
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController()
@RequestMapping("/api/campaign")
class CampaignController(val campaignService: CampaignService) {

    @GetMapping()
    fun getGames(@AuthenticationPrincipal user: User): List<CampaignDTO> {
        return campaignService.findAllActiveCampaigns(user)
    }

    @PostMapping()
    fun createGame(@AuthenticationPrincipal user: User, @RequestBody campaignDTO: CampaignDTO): CampaignDTO {
        return campaignService.save(user, campaignDTO)
    }

    @DeleteMapping()
    fun archiveGame(@AuthenticationPrincipal user: User, @RequestBody campaignDTO: CampaignDTO) {
        campaignService.archive(user, campaignDTO)
    }
}