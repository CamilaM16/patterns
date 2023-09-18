package page;

import data.User;
import mail.Mail;
import mail.MailCustom;
import mail.MailGoogle;
import utils.AccessType;

public class LoginPageProxy implements Page {
    private UserPage userPage;

    public String getAccess(AccessType type, String email, String pwd) {
        Mail mail = getAccessType(type);
        User user = mail.putCredetials(email, pwd);
        if (user != null) {
            userPage = new UserPage(user);
            return mail.getToken();
        }
        throw new IllegalAccessError();
    }

    public Mail getAccessType(AccessType accessType) {
        Mail mail;
        switch (accessType) {
            case CUSTOM:
                mail = new MailCustom();
                break;
            case GOOGLE:
                mail = new MailGoogle();
                break;
            default:
                throw new IllegalAccessError();
        }
        return mail;
    }

    @Override
    public String sayHello() {
        return userPage != null ? userPage.sayHello() : "Not Access";
    }
}