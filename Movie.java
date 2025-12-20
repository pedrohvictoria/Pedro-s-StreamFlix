//package StreamFlix;

public class Movie extends Media implements Playable {
    private int duration;

    public Movie(String title, String genre, int duration) {
        super(title, genre);
        this.duration = duration;
    }

    @Override
    public String getDetails() {
        return "Movie: " + title + " | Genre: " + genre + " | " + duration + " min";
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + title + "...");
    }
}
