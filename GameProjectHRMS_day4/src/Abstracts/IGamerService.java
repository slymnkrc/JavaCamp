package Abstracts;

import Entities.Gamer;

public interface IGamerService { // oyuncularý sisteme kaydetme, silme ve güncelleme kýsmý
	
	public void Save(Gamer gamer);
	public void Update(Gamer gamer);
	public void Delete(Gamer gamer);

}
