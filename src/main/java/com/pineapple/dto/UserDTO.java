package com.pineapple.dto;

public class UserDTO {

    private int id;

    private String username;
    private String password;
    private String usertype;

    private String isAdmin;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDTO() {
        super();
    }

    public UserDTO(int id, String username, String password, String usertype, String isAdmin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
        this.isAdmin = isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
