//package StreamFlix;

public class Series extends Media implements Playable {
    private int episodes;

    public Series(String title, String genre, int episodes) {
        super(title, genre);
        this.episodes = episodes;
    }

    @Override
    public String getDetails() {
        return "Series: " + title + " | Genre: " + genre + " | " + episodes + " episodes";
    }

    @Override
    public void play() {
        System.out.println("Playing series: " + title + "...");
    }
}

