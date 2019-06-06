package com.joebas.customerservice.service.impl;

import com.joebas.customerservice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.joebas.customerservice.repository.CustomerRepository;
import com.joebas.customerservice.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Mono<Customer> createCustomer(Customer customer) {
       return  customerRepository.insert(customer);
    }

    @Override
    public Mono<Customer> updateCustomer(Customer customer, String id) {
        return null;
    }

    @Override
    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Mono<Customer> findOne(String id) {
        return customerRepository.findById(id).switchIfEmpty(Mono.error(new Exception("Id does not exist")));
    }

    @Override
    public Mono<Boolean> delete(String id) {
        return findOne(id).doOnSuccess(customer -> {
           // customer.setDelete(true);
            customerRepository.save(customer).subscribe();
        }).flatMap(customer-> Mono.just(Boolean.TRUE));
    }
}
