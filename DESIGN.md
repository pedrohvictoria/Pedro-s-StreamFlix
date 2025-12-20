Menu Sketch:

          Welcome to
          StreamFlix
        │ 1- Movies │
        │ 2- Series │
     │ 3- Full Catalog │
       │ 4- My List │
        │ 5- Profile │
       │ 6- Settings │

Class list:
Main, Media, Movie, Series, Catalog, Profile, Playable, User.

-------------------------------------

Menu 2.0:

          Welcome to
          StreamFlix

     │    1- Movies    │
     │    2- Series    │
     │ 3- Full Catalog │
     │    4- My List   │
     │    5- Profile   │
     │   6- Settings   │
     │    0- Exit      │

-------------------------------------

Menu 3.0 (Final Version):

     Welcome to
     StreamFlix

    │ 1- Movies       │
    │ 2- Series       │
    │ 3- Full Catalog │
    │ 4- My List      │
    │ 5- Profile      │
    │ 6- Settings     │
    │ 0- Exit         │

-------------------------------------

Abstract Class:
- Media
- Media contains common attributes such as title and genre
- Media defines an abstract method called getDetails()
- Media also defines the general structure shared by all media types

Classes Extending Media:
- Movie
- Series
- Both classes extend Media
- Both classes override the getDetails() method to return their own details

-------------------------------------

Interface:
- Playable
- Defines the method play()
- Both Movie and Series implement the Playable interface
- This allows different media types to be played using the same method call

-------------------------------------

Polymorphism:
- The Catalog class stores all content in an ArrayList<Media>
- Movie and Series objects are treated as Media objects when stored
- When content is played from the menu, a Media object is treated as a Playable object
- The play() method that runs depends on the actual object type (Movie or Series)

-------------------------------------

Arrays / ArrayLists:
- An ArrayList is used inside the Catalog class to store all movies and series
- The list allows media to be added dynamically while the program is running
- The My List menu option uses the same list structure to display stored media

-------------------------------------

Design Notes:
- The project is structured to focus on clean organization and OOP principles
- The menu is intentionally simple to make the program easy to use and test
- Some features are placeholders and are included to show planned expansion
