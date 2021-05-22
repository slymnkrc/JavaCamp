package Entities;

public class Game {
	private int Id;
	private String GameName;
	private String GamePrice;
	
	public Game() {
		
	}

	public Game(int id, String gameName, String gamePrice) {
		super();
		Id = id;
		GameName = gameName;
		GamePrice = gamePrice;
	}

	public int getId() {
		return Id;
	}

	public String getGameName() {
		return GameName;
	}

	public String getGamePrice() {
		return GamePrice;
	}

	public void setId(int id) {
		Id = id;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public void setGamePrice(String gamePrice) {
		GamePrice = gamePrice;
	}
}
