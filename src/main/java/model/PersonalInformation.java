package model;

import lombok.*;

import java.sql.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonalInformation {
    private String id_;
    private String firstName;
    private String lastName;
    private String middleName;
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;

}
