package mail;

import data.Data;
import utils.AccessType;

public class MailGoogle extends MailImpl {
    public final static String TOKEN = "%s-%d";

    public MailGoogle() {
        super(AccessType.GOOGLE, Data.getGoogleData());
    }

    @Override
    String createToken() {
        int accessNumber = (int) (Math.random() * 100);
        return String.format(TOKEN, super.TYPE.getDomain(), accessNumber);
    }

}
