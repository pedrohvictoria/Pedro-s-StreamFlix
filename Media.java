//package StreamFlix;

public abstract class Media {
    protected String title;
    protected String genre;

    public Media(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public abstract String getDetails();
}
