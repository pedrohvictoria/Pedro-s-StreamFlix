//package StreamFlixUcc;
package StreamFlix;

import java.util.ArrayList;

public class Catalog {

    private ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia(Media m) {
        mediaList.add(m);
    }

    public ArrayList<Media> getMediaList() {
        return mediaList;
    }

    public void displayCatalog() {
        System.out.println("\n--- Full Catalog ---");

        if (mediaList.isEmpty()) {
            System.out.println("The catalog is empty.");
            return;
        }

        for (Media m : mediaList) {
            System.out.println(m.getDetails());
        }
    }
}
