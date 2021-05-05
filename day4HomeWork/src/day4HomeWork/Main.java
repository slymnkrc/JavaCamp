package day4HomeWork;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player("10101010101", "Süleyman", "KARACA", 1997);

		System.out.println(player.getFirstName());
		
		ControlManager controlManager = new ControlManager();

		PlayerManager playerManager = new PlayerManager(controlManager);
		playerManager.add(player);
		playerManager.delete(player);
		playerManager.update(player, "16543219871", "Sherlock", "Holmes", 1800);
		
		Game game = new Game("1","FİFA 21", "2020", "EA Games", 250);
		
		GameManager gameManager = new GameManager();
		gameManager.sell(player, game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.doCampaign(game, 10);
		campaignManager.deleteCampaign(game);
		campaignManager.updateCampaign(game, 10, 15);
	}

}