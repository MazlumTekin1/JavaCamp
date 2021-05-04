package abstracts;
import Entities.Customer;
public abstract class BaseCustomerManager implements CustomerService{
	
	public void save(Customer customer) {
		System.out.println("Save to DB : " + customer.firstName);
	}
	public static void add(Customer customer) {
		
	}

}
