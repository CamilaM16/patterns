package mail;

import data.User;

public interface Mail {
    User putCredetials(String mail, String pwd);

    String getToken();

}