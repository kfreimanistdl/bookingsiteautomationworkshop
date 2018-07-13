package general;

import lombok.Data;

import static utils.RandomGenerator.generateEmail;
import static utils.RandomGenerator.generatePhoneNumber;
import static utils.RandomGenerator.generateRandomString;

@Data
public class Account {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;

    public Account() {
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.phoneNumber = generatePhoneNumber();
        this.email = generateEmail();
        this.password = generateRandomString();
    }



}
