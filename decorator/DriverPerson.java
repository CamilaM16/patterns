package decorator;

public class DriverPerson extends PersonDecorator{

    public DriverPerson(Person person) {
        super(person);
    }
    
    @Override
    public String getProffesion() {
        return super.getProffesion() + " and driver";
    }
}