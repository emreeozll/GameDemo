
public class CampaignManager extends GameManager {

	
	public void addcampaign(Campaign campaign) {
	
		System.out.println( campaign.getCampaignname()+" adl� kampanya eklenmi�tir.");
	}
	
	public void deletecampaign(Campaign campaign) {
		
		System.out.println(campaign.getCampaignname()+" adl� kampanya silinmi�tir.");
	}
	
	public void updatecampaign(Campaign campaign) {
		
		System.out.println( campaign.getCampaignname()+" adl� kampanya g�ncellenmi�tir.");
	}
	
}
