package Entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Entity
@Table(name = "user_auth_token" , schema = "TestProject")
public class UserAuthTokenEntity implements Serializable {

    /* ID Column */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /* Version Column */
    @Version
    @Column(name = "VERSION", length = 19, nullable = false)
    private Long version;

    /* User ID Column */
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserEntity user;

    /* Access Token Column */
    @Column(name = "ACCESS_TOKEN")
    @NotNull
    @Size(max = 500)
    private String accessToken;

    /* Expires At Column */
    @Column(name = "EXPIRES_AT")
    @NotNull
    private ZonedDateTime expiresAt;

    /* Login At Column */
    @Column(name = "LOGIN_AT")
    @NotNull
    private ZonedDateTime loginAt;

    /* Logout Column */
    @Column(name = "LOGOUT_AT")
    private ZonedDateTime logoutAt;

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

    /* Getters & Setters Methods */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public ZonedDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public ZonedDateTime getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(ZonedDateTime loginAt) {
        this.loginAt = loginAt;
    }

    public ZonedDateTime getLogoutAt() {
        return logoutAt;
    }

    public void setLogoutAt(ZonedDateTime logoutAt) {
        this.logoutAt = logoutAt;
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

    /* Equal, Hashcode & ToStrong Methods */

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
