package com.joebas.customerservice.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "Customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer extends BaseEntity {
    @Id
    private String id;
    private String name;
    private PersonalInformation personalinfo;
    private List<Address> address= new ArrayList<Address>();
    private String customerType;

}
