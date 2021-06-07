package Business.Concretes;

import Adapters.Abstracts.CustomerCheckService;
import Business.Abstracts.BaseCustomerManager;
import Entities.Concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
CustomerCheckService checkService;


public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
	this.checkService=customerCheckService;
	
}

@Override
public void Save(Customer customer) {
	
	if(checkService.checkIfRealPerson(customer))
	{
		super.Save(customer);
	}
	else 
	{
		System.out.println(customer.getFirstName()+" Kayit Database Kaydedilemedi.");
	}
}


}