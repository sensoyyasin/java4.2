package Concrete;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {
private CustomerCheckService customerCheckService;
public CustomerManager(CustomerCheckService customerCheckService) {
	this.customerCheckService = customerCheckService;
}
	@Override
	public void add(Customer customer) {
	
		 if (this.customerCheckService.checkIfRealPerson(customer)) {
	            System.out.println("Customer's added : " + customer.getFirstName());
	        } 
		 else {
	            System.out.println("Customer is not added");
	        }
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Customer updated");
		
	}

	@Override
	public void delete(Customer customer) {
        System.out.println("Customer deleted");

		
	}
	

}
