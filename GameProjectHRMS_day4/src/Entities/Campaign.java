package Entities;

public class Campaign {
	private int Id;
	private String CampaignName;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName) {
		super();
		Id = id;
		CampaignName = campaignName;
	}

	public int getId() {
		return Id;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
}
