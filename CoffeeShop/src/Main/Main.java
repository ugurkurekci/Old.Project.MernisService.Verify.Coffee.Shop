package Main;

import Adapters.Concretes.MernisServiceAdapter;
import Business.Abstracts.BaseCustomerManager;
import Business.Concretes.StarbucksCustomerManager;
import Entities.Concretes.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager manager = new StarbucksCustomerManager(new MernisServiceAdapter());
	    manager.Save(new Customer(1,"Uður" , "Kürekci", 1998 , "11111111111" ));
	    manager.Save(new Customer(2,"Uður" , "Kürekci", 1998 , "22222222222" ));	
	}

}
