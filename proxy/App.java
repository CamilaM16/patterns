import page.LoginPageProxy;
import utils.AccessType;

public class App {
    public static void main(String[] args) {
        LoginPageProxy userPage = new LoginPageProxy();
        String token = userPage.getAccess(AccessType.GOOGLE, "user@google.com", "123");
        System.out.println("Token:" + token);
        System.out.println(userPage.sayHello());
    }
}
