package mail;

import java.util.HashMap;
import data.User;
import utils.AccessType;

public abstract class MailImpl implements Mail {
    private final static String TOKEN = "TOKEN-%s";
    protected final AccessType TYPE;

    private HashMap<String, User> data;

    public MailImpl(AccessType type, HashMap<String, User> data) {
        this.TYPE = type;
        this.data = data;
    }

    public User putCredetials(String mail, String pwd) {
        if (mail.contains(TYPE.getDomain()) && data.get(mail) != null) {
            if (data.get(mail).comparePwd(TYPE, pwd)) {
                return data.get(mail);
            }
        }
        return null;
    }

    public String getToken() {
        return String.format(TOKEN, createToken());
    }

    abstract String createToken();
}
