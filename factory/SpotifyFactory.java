package factory;

public class SpotifyFactory extends Factory {

    @Override
    Task createTask() {
        return new Spotify();
    }
    
}
