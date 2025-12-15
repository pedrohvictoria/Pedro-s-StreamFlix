//package StreamFlixUcc;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public void displayCatalog() {
        System.out.println("----- StreamFlix Catalog -----");
        for (Media m : mediaList) {
            System.out.println(m.getDetails());
        }
    }
}
