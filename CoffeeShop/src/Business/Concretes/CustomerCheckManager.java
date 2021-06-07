package Business.Concretes;

import Adapters.Abstracts.CustomerCheckService;
import Entities.Concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

}
