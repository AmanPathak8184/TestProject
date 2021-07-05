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
@Table (name = "roles" , schema = "TestProject")

public class RoleEntity implements Serializable {

    /* ID Column */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /* UUID Column */
    @Column(name = "UUID")
    @NotNull
    private int uuid;

    /* Version Column */
    @Column(name = "VERSION" , length = 19, nullable = false)
    private long version;

    /* Name Column */
    @Column(name = "NAME")
    @NotNull
    @Size(max = 50)
    private String name;

    /* Description Column */
    @Column(name = "DESCRIPTION")
    @Size(max = 200)
    private String description;

    /* Active Column */
    @Column(name = "ACTIVE")
    @NotNull
    private boolean active;

    /* Created By Column */
    @Column(name = "CREATED_BY")
    @NotNull
    @Size(max = 100)
    private String createdBy;

    /* Created At column */
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

    /* Setters & Getters Method */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
