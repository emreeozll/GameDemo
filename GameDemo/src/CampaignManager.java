
public class CampaignManager extends GameManager {

	
	public void addcampaign(Campaign campaign) {
	
		System.out.println( campaign.getCampaignname()+" adlý kampanya eklenmiþtir.");
	}
	
	public void deletecampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignname()+" adlý kampanya silinmiþtir.");
	}
	
	public void updatecampaign(Campaign campaign) {
		
		System.out.println( campaign.getCampaignname()+" adlý kampanya güncellenmiþtir.");
	}
	
}
