package com.joebas.customerservice.Controller;

import com.joebas.customerservice.model.Customer;
import com.joebas.customerservice.request.CustomerRequest;
import com.joebas.customerservice.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/joebas")
public class CustomerResource {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/get")
    public String hello(){
        return "";
    }

    @PostMapping("/save")
    public Mono<Customer> save(@RequestBody CustomerRequest customerRequest){
        return customerService.createCustomer(customerRequest);

    }
    @GetMapping("/find/{id}")
    public Mono<Customer> find(@PathVariable("id") String id){
      return   customerService.findOne(id);

    }
}
