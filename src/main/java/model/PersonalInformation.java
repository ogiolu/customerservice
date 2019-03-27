package model;

import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonalInformation extends BaseEntity  {
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private String gender;
    private List<String> phoneNumber= new ArrayList<String>();
    private List<String>  email =new ArrayList<String>();
    private String maritalStatus;



}
