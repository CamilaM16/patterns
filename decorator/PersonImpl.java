package decorator;

public class PersonImpl implements Person {
    private String name;
    private String profession;

    PersonImpl(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProffesion() {
        return profession;
    }

    public String toString() {
        return "{ name: " + getName() + " proffesion: " + getProffesion() + " }";
    }
}
