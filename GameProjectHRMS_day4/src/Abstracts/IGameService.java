package Abstracts;

import Entities.Game;

public interface IGameService {
	
	public void Save(Game game);
	public void Update(Game game);
	public void Delete(Game game);

}
