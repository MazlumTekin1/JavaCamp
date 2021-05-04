import java.util.Calendar;

import abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		// StarbucksCustomerManager yerine NeroCustomerManager yazarsan Nero sisteminin db sine erişirsin
		BaseCustomerManager customerManager2 = new NeroCustomerManager(null);
		
		Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1999,11,01);
		
		Customer customer = new Customer(1 , "MAZLUM" , "TEKİN" , dateOfBirth ,"11111111111"); 
		//Customerin icine yazdigim bilgilere kendi bilgilerini eklersen kendi mernis sistemine erişirsin
		//11111111111 yazdığım yere TC kimlik numaranı girersen Mernise erişebilirsin.
		
		BaseCustomerManager.add(customer);
		BaseCustomerManager.add(customer);
		
			customerManager.save(customer);	
			System.out.println();
	}

}