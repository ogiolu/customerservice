package com.joebas.customerservice.request;

import com.joebas.customerservice.model.Address;
import com.joebas.customerservice.model.PersonalInformation;
import lombok.Data;

import java.util.ArrayList;

import java.util.List;
@Data
public class CustomerRequest {
    private String name;
    private PersonalInformation personalinfo;
    private List<Address> address= new ArrayList<Address>();
    private String customerType;
}
