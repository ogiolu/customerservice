package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

@Service("customerservice")
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

}
