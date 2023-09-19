package page;

import data.User;

public class UserPage implements Page{
    private final static String FORMAT = "%s: Hello!!!"; 
    private User user;

    public UserPage(User user) {
        this.user = user;
    }

    public String sayHello() {
        return String.format(FORMAT, user.getUserName());
    }
    
}