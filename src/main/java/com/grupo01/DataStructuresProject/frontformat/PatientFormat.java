package com.grupo01.DataStructuresProject.frontformat;

import com.grupo01.DataStructuresProject.models.PatientUser;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PatientFormat implements JsonMasticadito{
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime registrationDate;

    // Constructor que acepta PatientUser y completa los campos
    public PatientFormat(PatientUser originalPatient) {
        this.id = originalPatient.getId();
        this.firstName = originalPatient.getFirstName();
        this.lastName = originalPatient.getLastName();
        this.email = originalPatient.getEmail();
        this.password = originalPatient.getPassword();
        this.registrationDate = originalPatient.getRegistrationDate();
    }
}
