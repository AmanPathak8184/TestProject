package Models;

public enum UserStatusType {

    REGISTERED("REGISTERED"),
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    LOCKED("LOCKED");

    private String value;

    UserStatusType(String value){
        this.value = value;
    }

}
