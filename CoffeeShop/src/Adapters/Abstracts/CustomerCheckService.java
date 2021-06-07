package Adapters.Abstracts;

import Entities.Concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
