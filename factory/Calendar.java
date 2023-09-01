package factory;

public class Calendar implements Task {
    public String[] getEvents(){
        return null;
    }

    @Override
    public String run() {
        return "Calendar...";
    }
}
