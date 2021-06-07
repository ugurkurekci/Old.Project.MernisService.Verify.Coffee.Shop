package Business.Abstracts;

import Entities.Concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService {
	
	public void Save(Customer customer) {
		System.out.println(customer.getFirstName()+" "+ customer.getLastName() + " " + "Kayit Database eklendi" );
	}

}
