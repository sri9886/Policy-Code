
package com.ipm.api.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicysService {
	@Autowired
	CustomerRepo crepo;
	
	// Insert data in Database
	public Policys saveCustomer(Policys c) {
		
		return crepo.save(c);
		
	}
	//Show all customer details
	public List<Policys> showCustomers(){
		
		return crepo.findAll();
		
	}
	//Show Data by email and password
	public Policys showCustomerUsingLogin(String email,String password) {
	
		return crepo.findByCemailAndCpassword(email, password);
	}
	
}