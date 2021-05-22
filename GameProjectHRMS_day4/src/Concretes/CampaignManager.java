package Concretes;

import Abstracts.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{
	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" "+ "Campaign Added");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" "+ "Campaign Updated");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" "+ "Campaign Deleted");
		
	}

}
