package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {

	
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
        try {
            return client.TCKimlikNoDogrula(customer.getNationalityId() , customer.getFirstName().toUpperCase(), customer.getSirName().toUpperCase(), customer.getbirthDate());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return false;
		
	}

}
