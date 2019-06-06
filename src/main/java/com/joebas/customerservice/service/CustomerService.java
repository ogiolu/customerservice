package com.joebas.customerservice.service;

import com.joebas.customerservice.model.Customer;
import com.joebas.customerservice.request.CustomerRequest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CustomerService {

        Mono<Customer> createCustomer(CustomerRequest customerRequest);

        Mono<Customer> updateCustomer(Customer customer, String id);

        Flux<Customer> findAll();

        Mono<Customer> findOne(String id);

        Mono<Boolean> delete(String id);

}
