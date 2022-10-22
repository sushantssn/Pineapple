package com.pineapple.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users",schema = "public")
public class UserEntity {

    @Id
    @GeneratedValue
    @Column(name = "userid")
    private int id;
    @Column
    private String username;
    @Column(name = "userpassword")
    @JsonIgnore
    private String password;
    @Column(name = "usertype")
    private String userType;

    @Column(name = "isAdmin")
    private String isAdmin;

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }
public UserEntity(){

}
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}

