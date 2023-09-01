package factory;

public class App {
    public static void main(String[] args) {
        Factory spotifyFactory = new SpotifyFactory();
        Task spotifyTask = spotifyFactory.createTask();
        println(spotifyTask.run());

        Factory calendarFactory = new CalendarFactory();
        Task calendarTask = calendarFactory.createTask();
        println(calendarTask.run());

        Factory chatFactory = new ChatFactory();
        Task chatTask = chatFactory.createTask();
        println(chatTask.run());
    }

    public static void println(String msg) {
        System.out.println(msg);
    }
}
