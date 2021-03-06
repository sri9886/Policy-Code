package com.ipm.api.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class PolicysControler {
	@Autowired
	PolicysService cs;
	//For adding Customer use (/addcustomer)
	@PostMapping("/addcustomer")
	public HttpStatus addCustomer(@RequestBody Policys cc) {
		
			try {
				cs.saveCustomer(cc);
			} catch (Exception e) {
				System.out.println("Something wend wrong ...."+e);
				return HttpStatus.IM_USED;
			}
		return HttpStatus.CREATED;
	}
}
	
	