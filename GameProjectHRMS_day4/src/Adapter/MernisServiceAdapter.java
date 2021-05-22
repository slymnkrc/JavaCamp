package Adapter;

import Abstracts.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService{

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		boolean end  = false;
		
		try {
			end= proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
					gamer.getFirstName().toUpperCase(),
			        gamer.getLastName().toUpperCase(),gamer.getDateOfBirth().getYear());
		}
		
		catch(Exception e){
			System.out.println("Not a valid person");
		}
		
		return end;
	}

}