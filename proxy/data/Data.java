package data;

import java.util.HashMap;

import utils.AccessType;

public class Data {
    private static HashMap<String, User> googleData;
    private static HashMap<String, User> customData;
    private static HashMap<String, User> outlookData;

    public static HashMap<String, User> getCustomData() {
        return customData == null ? loadCustomData() : customData;
    }

    public static HashMap<String, User> getGoogleData() {
        return googleData == null ? loadGoogleData() : googleData;
    }

    public static HashMap<String, User> getOutlookData() {
        return outlookData;
    }

    private static HashMap<String, User> loadGoogleData() {
        googleData = new HashMap<>();
        User u = new User("user@google.com", "123", "user1", AccessType.GOOGLE);
        User u2 = new User("user2@google.com", "admin", "user2", AccessType.GOOGLE);

        googleData.put(u.getEmail(), u);
        googleData.put(u2.getEmail(), u2);

        return googleData;
    }

    private static HashMap<String, User> loadCustomData() {
        customData = new HashMap<>();
        User u = new User("user@page.com", "1234", "user3", AccessType.CUSTOM);
        User u2 = new User("user2@page.com", "admin13", "user4", AccessType.CUSTOM);

        customData.put(u.getEmail(), u);
        customData.put(u2.getEmail(), u2);

        return customData;
    }
}
