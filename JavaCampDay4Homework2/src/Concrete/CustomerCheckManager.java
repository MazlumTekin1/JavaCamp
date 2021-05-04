package Concrete;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}	
}
