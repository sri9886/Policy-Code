package com.ipm.api.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface  CustomerRepo extends JpaRepository<Policys, Long> {

	

	

}
