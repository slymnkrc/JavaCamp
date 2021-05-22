package Concretes;

import Abstracts.ISaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISaleService{


	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +" "+ game.getGameName()+
				" " +"to Bought from"+ " "+ game.getGamePrice());
		
	}

	@Override
	public void CampaignSale(Game game, Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" " + "For"+ " "+ game.getGameName() +" "+ "selling");
		
	}

	

}
