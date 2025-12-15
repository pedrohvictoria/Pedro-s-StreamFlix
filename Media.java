//package StreamFlixUcc;

public abstract class Media {

    protected String title;
    protected String genre;
    protected int duration;

    public Media(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public abstract String getDetails();
}
