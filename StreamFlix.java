//package StreamFlixUcc; I dont know why but i had to create a package for it to run on eclipse

import java.util.ArrayList;
import java.util.Scanner;

public class StreamFlix {

    private static Catalog catalog = new Catalog();
    private static ArrayList<Media> myList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int menuOption;

        catalog.addMedia(new Movie("Inception", "Sci-Fi", 148));
        catalog.addMedia(new Series("Adventure Time", "Cartoon", 283));

        while (true) {
            System.out.println();
            System.out.println("     Welcome to");
            System.out.println("     StreamFlix");
            System.out.println();
            System.out.println(" │ 1- Movies       │");
            System.out.println(" │ 2- Series       │");
            System.out.println(" │ 3- Full Catalog │");
            System.out.println(" │ 4- My List      │");
            System.out.println(" │ 5- Profile      │");
            System.out.println(" │ 6- Settings     │");
            System.out.println(" │ 0- Exit         │");
            System.out.println();
            System.out.print("Select your option: ");

            menuOption = input.nextInt();

            if (menuOption == 0) {
                System.out.println("Exiting StreamFlix...");
                break;
            }

            switch (menuOption) {
                case 1:
                	WIPMOVIES();
                    break;
                    
                case 2:
                	WIPSERIES();
                	break;
                	
                case 3:
                    catalog.displayCatalog();
                    playFirstItem();
                    break;

                case 4:
                    showMyList();
                    break;

                case 5:
                    profileDetails(input);
                    break;

                case 6:
                	settings();
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        input.close();
    }

    private static void playFirstItem() {
        if (!catalog.getMediaList().isEmpty()) {
            Playable p = (Playable) catalog.getMediaList().get(0);
            p.play();
        }
    }

    private static void WIPMOVIES() {
        System.out.println("Working on it, come back later");
    }
    
    private static void WIPSERIES() {
        System.out.println("Working on it, come back later");
    }
    
    private static void showMyList() {
        System.out.println("My List is empty.");
    }
    
    private static void settings() {
        System.out.println("Working on it, come back later");
    }

    public static void profileDetails(Scanner input) {
        System.out.println("-----------------------");
        System.out.println("    Profile Details   ");
        System.out.println("-----------------------");
        System.out.println(" First Name: Pedro");
        System.out.println(" Last Name: Victoria");
        System.out.println(" Age: 21");
        System.out.println(" Country: United States");
        System.out.println("-----------------------");
        System.out.print("Type anything to return to menu: ");
        input.next();
    }
}
