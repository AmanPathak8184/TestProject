package Entities;

import org.apache.commons.lang3.builder.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "users" , schema = "TestProject")
public class UserEntity implements Serializable {


    /* ID Column */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /* UUID Column */
    @Column(name = "UUID")
    @NotNull
    @Size (max = 36)
    private String uuid;

    /* Version Column */
    @Version
    @Column(name = "VERSION", length = 19, nullable = false)
    private Long version;

    /* Role ID Column */
    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private RoleEntity role;


    /* Email Column */
    @Column(name = "EMAIL")
    @NotNull
    @Size(max = 200)
    private String email;

    /* Password Column */
    @Column(name = "PASSWORD")
    @ToStringExclude
    @NotNull
    @Size(max = 200)
    private String password;

    /* Salt Column */
    @Column(name = "SALT")
    @NotNull
    @Size(max = 200)
    @ToStringExclude
    private String salt;

    /* First Name Column */
    @Column(name = "FIRST_NAME")
    @NotNull
    @Size(max = 50)
    private String firstName;

    /* Last Name Column */
    @Column(name = "LAST_NAME")
    @NotNull
    @Size(max = 50)
    private String lastName;

    /* Mobile Phone Column */
    @Column(name = "MOBILE_PHONE")
    @NotNull
    @Size(max = 50)
    private String mobilePhone;

    /* Status Column */
    @Column(name = "STATUS")
    @NotNull
    private  int Status;

    /* Failed  Login Count Column */
    @Column(name = "FAILED_LOGIN_COUNT")
    @Min(0)
    @Max(5)
    private int failedLoginCount;

    /* Last Password Change At Column */
    @Column(name = "LAST_PASSWORD_CHANGE_AT")
    private ZonedDateTime lastPasswordChangeAt;

    /* Last Login At Column */
    @Column(name = "LAST_LOGIN_AT")
    private ZonedDateTime lastLoginAt;

    /* Created By Column */
    @Column(name = "CREATED_BY")
    @NotNull
    @Size(max = 100)
    private String createdBy;

    /* Created At Column */
    @Column(name = "CREATED_AT")
    @NotNull
    private ZonedDateTime createdAt;

    /* Modified By Column */
    @Column(name = "MODIFIED_BY")
    @Size(max = 100)
    private String modifiedBy;

    /* Modified At Column */
    @Column(name = "MODIFIED_AT")
    private ZonedDateTime modifiedAt;

    /* Getters & Setters */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getFailedLoginCount() {
        return failedLoginCount;
    }

    public void setFailedLoginCount(int failedLoginCount) {
        this.failedLoginCount = failedLoginCount;
    }

    public ZonedDateTime getLastPasswordChangeAt() {
        return lastPasswordChangeAt;
    }

    public void setLastPasswordChangeAt(ZonedDateTime lastPasswordChangeAt) {
        this.lastPasswordChangeAt = lastPasswordChangeAt;
    }

    public ZonedDateTime getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(ZonedDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public ZonedDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(ZonedDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /* Equal, HashCode and ToString Methods */


    @Override
    public boolean equals(Object obj){
        return new EqualsBuilder().append(this,obj).isEquals();
    }

    @Override
    public int hashCode(){
        return new HashCodeBuilder().append(this).hashCode();
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
