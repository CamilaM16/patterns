package mail;

import data.Data;
import utils.AccessType;

public class MailCustom extends MailImpl {
    public final static String TOKEN = "%s-%d";
    public static int tokenNumber = 0;

    public MailCustom() {
        super(AccessType.CUSTOM, Data.getCustomData());
    }

    @Override
    String createToken() {
        return String.format(TOKEN, super.TYPE.getDomain(), tokenNumber++);
    }
}
