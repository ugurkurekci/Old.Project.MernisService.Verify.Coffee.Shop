package Adapters.Concretes;
import java.util.Locale;
import Adapters.Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
			
		boolean result = true;
		
		try {
			result= kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastName().toUpperCase(new Locale("tr")), customer.getTimeOfBirth());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
