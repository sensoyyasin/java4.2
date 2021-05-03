package Abstract;
import Entities.Customer;
import java.rmi.RemoteException;
public interface CustomerCheckService {
	
	public boolean checkIfRealPerson(Customer customer);
		
	}
