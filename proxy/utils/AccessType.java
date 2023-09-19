package utils;

public enum AccessType {
    GOOGLE("google.com"),
    CUSTOM("page.com"),
    OUTLOOK(""),
    FACEBOOK("");

    final String domain;

    private AccessType(String domain){
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }
}
