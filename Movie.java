//package StreamFlixUcc;

public class Movie extends Media implements Playable {

    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);
    }

    @Override
    public String getDetails() {
        return "Movie: " + title + " | Genre: " + genre + " | Duration: " + duration + " min";
    }

    @Override
    public void play() {
        System.out.println("Now playing movie: " + title);
    }
}
