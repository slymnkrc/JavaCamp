package Concretes;

import Abstracts.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void Save(Game game) {
		System.out.println(game.getGameName() +" "+ "Has Been Saved");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getGameName() +" "+ "Has Been Updated");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getGameName() +" "+ "Has Been Deleted");
		
	}
}