package decorator;

public class PersonDecorator implements Person {
    private Person wrapper;

    public PersonDecorator(Person person) {
        this.wrapper = person;
    }

    @Override
    public String getName() {
        return wrapper.getName();
    }

    @Override
    public String getProffesion() {
        return wrapper.getProffesion();
    }

    public String toString() {
        return "{ name: " + wrapper.getName() + " proffesion: " + wrapper.getProffesion() + " }";
    }
}
