package Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

@Validated
public class SignupUserRequest {

    @JsonProperty("First_Name")
    private String firstName = null;

    @JsonProperty("Last_Name")
    private String lastName = null;

    @JsonProperty("Email_Address")
    private String emailAddress = null;

    @JsonProperty("Password")
    private  String password = null;

    @JsonProperty ("Mobile_Number")
    private  String mobileNumber = null;


    /** First Name **/

    // Getter
    public String getFirstName(){
        return this.firstName;
    }

    // Setter
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // Function
    public SignupUserRequest firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    /** Last Name **/

    // Getter
    public String getLastName(){
        return this.lastName;
    }

    // Setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    // Function
    public SignupUserRequest lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    /** Email Address **/

    // Getter
    public String getEmailAddress(){
        return this.emailAddress;
    }

    // Setter
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    // Function
    public SignupUserRequest emailAddress(String emailAddress){
        this.emailAddress = emailAddress;
        return this;
    }

    /** Password **/

    // Getter
    public String getPassword(){
        return this.password;
    }

    // Setter
    public void setPassword(String password){
        this.password = password;
    }

    // Function
    public SignupUserRequest password(String password){
        this.password = password;
        return this;
    }

    /** Mobile Number **/

    // Getter
    public String getMobileNumber(){
        return this.mobileNumber;
    }

    // Setter
    public void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    // Function
    public SignupUserRequest mobileNumber(String mobileNumber){
        this.password = mobileNumber;
        return this;
    }

}


