package Business.Concretes;

import Business.Abstracts.CustomerService;
import Entities.Concretes.Customer;

public class NeroCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println(" Nero Müsteri Kaydedildi. " );
	}

}
