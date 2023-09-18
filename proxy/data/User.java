package data;

import utils.AccessType;

public class User {
    private AccessType mail;
    private String email;
    private String password;
    private String userName;

    public User(String email, String password, String userName, AccessType type) {
        this.mail = type;
        this.email = email;
        this.password = password;
        this.userName = userName;
    }

    public boolean comparePwd(AccessType mail, String pwd) {
        return this.mail.equals(mail) ? password.equals(pwd) : false;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
