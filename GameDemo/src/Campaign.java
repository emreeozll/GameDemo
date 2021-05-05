
public class Campaign {

	
	String campaignname;
	int campaigndiscount;
	
	public Campaign(String campaignname, int campaigndiscount) {
		super();
		this.campaignname = campaignname;
		this.campaigndiscount = campaigndiscount;
	}

	public String getCampaignname() {
		return campaignname;
	}

	public void setCampaignname(String campaignname) {
		this.campaignname = campaignname;
	}

	public int getCampaigndiscount() {
		return campaigndiscount;
	}

	public void setCampaigndiscount(int campaigndiscount) {
		this.campaigndiscount = campaigndiscount;
	}
	
}
