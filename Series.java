//package StreamFlixUcc;

public class Series extends Media implements Playable {

    public Series(String title, String genre, int episodes) {
        super(title, genre, episodes);
    }

    @Override
    public String getDetails() {
        return "Series: " + title + " | Genre: " + genre + " | Episodes: " + duration;
    }

    @Override
    public void play() {
        System.out.println("Now playing series: " + title);
    }
}
