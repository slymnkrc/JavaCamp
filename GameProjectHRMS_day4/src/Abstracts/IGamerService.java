package Abstracts;

import Entities.Gamer;

public interface IGamerService { // oyuncular� sisteme kaydetme, silme ve g�ncelleme k�sm�
	
	public void Save(Gamer gamer);
	public void Update(Gamer gamer);
	public void Delete(Gamer gamer);

}
