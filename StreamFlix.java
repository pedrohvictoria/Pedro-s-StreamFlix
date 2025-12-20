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
                    moviesMenu(input);
                    break;

                case 2:
                    seriesMenu(input);
                    break;

                case 3:
                    fullCatalogMenu(input);
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

    private static void moviesMenu(Scanner input) {
        System.out.println("\n--- Movies ---");

        for (Media m : catalog.getMediaList()) {
            if (m instanceof Movie) {
                System.out.println(m.getDetails());
            }
        }

        System.out.println("\n1- Add Movie");
        System.out.println("0- Back");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.print("Movie name: ");
            String name = input.nextLine();

            System.out.print("Genre: ");
            String genre = input.nextLine();

            System.out.print("Minutes: ");
            int minutes = input.nextInt();

            catalog.addMedia(new Movie(name, genre, minutes));
            System.out.println("Movie added successfully.");
        }
    }

    private static void seriesMenu(Scanner input) {
        System.out.println("\n--- Series ---");

        for (Media m : catalog.getMediaList()) {
            if (m instanceof Series) {
                System.out.println(m.getDetails());
            }
        }

        System.out.println("\n1- Add Series");
        System.out.println("0- Back");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            System.out.print("Series name: ");
            String name = input.nextLine();

            System.out.print("Genre: ");
            String genre = input.nextLine();

            System.out.print("Episodes: ");
            int episodes = input.nextInt();

            catalog.addMedia(new Series(name, genre, episodes));
            System.out.println("Series added successfully.");
        }
    }

    private static void fullCatalogMenu(Scanner input) {
        System.out.println("\n--- Full Catalog ---");

        ArrayList<Media> list = catalog.getMediaList();
        if (list.isEmpty()) {
            System.out.println("The catalog is empty.");
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + "- " + list.get(i).getDetails());
        }

        System.out.println("0- Back");
        System.out.print("Select a number to play: ");

        int choice = input.nextInt();
        input.nextLine();

        if (choice > 0 && choice <= list.size()) {
            Playable p = (Playable) list.get(choice - 1);
            p.play();
        } else if (choice != 0) {
            System.out.println("Invalid selection.");
        }
    }

    private static void showMyList() {
        System.out.println("\n--- My List ---");

        if (catalog.getMediaList().isEmpty()) {
            System.out.println("My List is empty.");
            return;
        }

        for (Media m : catalog.getMediaList()) {
            System.out.println(m.getDetails());
        }
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
