package com.yaohongjie.runner.core.repository;

import com.yaohongjie.runner.core.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByUsernameAndPassword(String userName,String password);

}
