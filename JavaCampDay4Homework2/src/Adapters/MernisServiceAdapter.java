package Adapters;

import java.rmi.RemoteException;
import java.util.Calendar;

import abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
        boolean result = false;
          try {
              result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().get(Calendar.YEAR));
          } catch (NumberFormatException e) {
              System.out.println("Bir hata oluştu!");
        	  e.printStackTrace();
               
          } catch (RemoteException e) {
              System.out.println("Bir hata oluştu!"); 
        	  e.printStackTrace();
          }
         return result;
	}

	

	

}