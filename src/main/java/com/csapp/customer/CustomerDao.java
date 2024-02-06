package com.csapp.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
    void insertCustomer(Customer customer);
    boolean existsPearsonWithEmail(String email);
    boolean existsPearsonWithId(Integer id);
    void deleteCustomerById(Integer customerId);

}
