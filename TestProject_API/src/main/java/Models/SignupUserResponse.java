package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

@Validated
public class SignupUserResponse {

    @JsonProperty("Id")
    private String id = null;

    @JsonProperty("Status")
    private String status = null;

    /** ID **/

    // Getter
    public String getId(){
        return this.id;
    }

    // Setter
    public void setId(String id){
        this.id = id;
    }

    // Function
    public SignupUserResponse id(String id){
        this.id = id;
        return this;
    }

    /** Status **/

    // Getter
    public String getStatus(){
        return this.status;
    }

    // Setter
    public void setStatus(String status){
        this.status = status;
    }

    // Function
    public SignupUserResponse status(String status){
        this.status = status;
        return this;
    }

}
