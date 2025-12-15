Menu Sketch:

---------------------------------------
              Welcome to
              StreamFlix
---------------------------------------
            │ 1- Movies │
            │ 2- Series │
         │ 3- Full Catalog │
           │ 4- My List │
            │ 5- Profile │
           │ 6- Settings │
----------------------------------------

Class list:
Main,
Media,
Movies,
Series,
Catalog,
Profile,
Play,
User;
.

menu 2.0

              Welcome to
              StreamFlix

         │    1- Movies    |
         │    2- Series    │
         │ 3- Full Catalog │
         │    4- My List   │
         │    5- Profile   │
         │   6- Settings   │
         │    0- Exit      │

.
menu 3.0

     Welcome to
     StreamFlix"

│ 1- Movies       │
│ 2- Series       │
│ 3- Full Catalog │
│ 4- My List      │
│ 5- Profile      │
│ 6- Settings     │
│ 0- Exit         │


-Abstract Class: Media
Has an abstract method called getDetails();
Two classes extenbding media: Movie, Series
Both classes Override getDetails()

-Interface: Playable
Defines mehod play()
Both Movie and Series implement Playable

-Polymorphism: The Catalog class stores all content in an ArrayList<Media>
also used ehn a content is played from the menu, a Media object is treated as a Playable object and the play() method is called

-Arrays: ArrayList<Media> inside the Catalog class to store all movies and series.
The “My List” menu option is included as part of the structure but is still getting worked on
.
