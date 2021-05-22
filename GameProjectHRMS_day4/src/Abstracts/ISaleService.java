package Abstracts;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISaleService {
	
	public void sale(Gamer gamer, Game game);
	public void CampaignSale(Game game, Campaign campaign);
	

}
