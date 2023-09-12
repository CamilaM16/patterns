package decorator;

public class TeacherPerson extends PersonDecorator {

    public TeacherPerson(Person person) {
        super(person);
    }

    @Override
    public String getProffesion() {
        return super.getProffesion() + " and teacher";
    }
}
