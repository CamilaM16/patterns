package factory;

public class CalendarFactory extends Factory {

    @Override
    Task createTask() {
        return new Calendar();
    }

}
