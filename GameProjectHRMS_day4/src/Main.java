import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager =new GamerManager(new MernisServiceAdapter());
		Gamer gamer1 =new Gamer(1,"suleyman","karaca","123456",LocalDate.of(1997, 3,11));
		gamerManager.Update(gamer1);
		
		GamerManager gamerManager2 =new GamerManager(new MernisServiceAdapter());
		Gamer gamer2=new Gamer(1,"fuat","aydýnc","73456",LocalDate.of(1995, 4,22));
		gamerManager.Save(gamer2);
		
		CampaignManager campaignManager= new CampaignManager();
		Campaign campaing1=new Campaign(1,"Summer Discount");
		campaignManager.Add(campaing1);
		
		GameManager gameManager=new GameManager();
		Game game1=new Game(1,"Pubg","5 Dolar");
		gameManager.Save(game1);
		
		SaleManager saleManager=new SaleManager();
		Sale sale1 =new Sale();
		saleManager.sale(gamer2, game1);
		
		SaleManager saleManager2=new SaleManager();
		Sale sale2=new Sale();
		saleManager2.CampaignSale(game1, campaing1);
		
		
		
	}
	
	

}