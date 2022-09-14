package git.cgteatejte91.capstoneproject.ui.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class WebsiteUser {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String username;
    @Indexed(unique = true)
    private String email;
    private String phoneNumber;
    private Gender gender;
    private Address address;
    private LocalDateTime created;

    public WebsiteUser() {
    }

    public WebsiteUser(String firstName, String lastName, String username, String email, String phoneNumber,
            Gender gender, Address address, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.address = address;
        this.created = created;
    }

    


    
}
