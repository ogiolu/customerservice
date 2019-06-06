package com.joebas.customerservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Address extends BaseEntity  {
    private String city;
    private String state;
    private String zipCode;
    private String street;
    private String country;
    
}
