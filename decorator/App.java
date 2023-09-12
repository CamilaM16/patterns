package decorator;

public class App {
    public static void main(String[] args) {
        Person p = new PersonImpl("Luisa Mercedes", "Lawyer");
        PersonDecorator decorator = new TeacherPerson(new DriverPerson(p));

        System.out.println(p);
        System.out.println("Proffesion: "+decorator.getProffesion());
    }
}
