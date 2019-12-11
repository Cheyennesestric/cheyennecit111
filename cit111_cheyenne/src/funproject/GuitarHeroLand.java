package funproject;

import java.util.Scanner;

/**
 *
 * @author cheyenne.sestric
 */
public class GuitarHeroLand {
    
    public static int songNumber;

    public static GuitarHeroSong song1;
    public static GuitarHeroSong song2;
    public static GuitarHeroSong song3;
    public static GuitarHeroSong song4;

    public static GuitarHeroSong choosenSong;

    public static void main(String[] args) {

        song1 = new GuitarHeroSong();

        song1.title = "1: Slow Ride ";
        song1.artist = "By: Foghat";
        song1.length = 3.93;

        song2 = new GuitarHeroSong();

        song2.title = "2: Talk Dirty To Me ";
        song2.artist = "By: Poison";
        song2.length = 3.73;

        song3 = new GuitarHeroSong();

        song3.title = "3: Hit Me With Your Best Shot ";
        song3.artist = "By: Pat Benetar";
        song3.length = 2.85;

        song4 = new GuitarHeroSong();

        song4.title = "4: Story Of My Life ";
        song4.artist = "By: Social Distruction";
        song4.length = 5.80;
        chooseDifficulty();
        chooseSong();
        //main programmed the song information for each song and then calls
        //the other methods to display different information choosen by user
    }

    public static void chooseDifficulty() {
        String response;

        System.out.println("What difficulty level would you like to play at? "
                + "(easy, medium, hard, expert)");
        Scanner keyboardReader = new Scanner(System.in);
        response = keyboardReader.next();
      
        if (response.equals("easy")) {
             
            song1.levelDifficulty = "easy";
            song1.amountOfNotes = 287 ;
        
            
            song2.levelDifficulty = "easy";
            song2.amountOfNotes = 380 ;
    

            song3.levelDifficulty = "easy";
            song3.amountOfNotes = 242 ;

            song4.levelDifficulty = "easy";
            song4.amountOfNotes = 510 ;

        } else if (response.equals("medium")) {

            song1.levelDifficulty = "medium";
            song1.amountOfNotes = 477 ;

            song2.levelDifficulty = "medium";
            song2.amountOfNotes = 460 ;

            song3.levelDifficulty = "medium";
            song3.amountOfNotes = 401 ;

            song4.levelDifficulty = "medium";
            song4.amountOfNotes = 708 ;

        } else if (response.equals("hard")) {
            song1.levelDifficulty = "hard";
            song1.amountOfNotes = 517 ;
            
            song2.levelDifficulty = "hard";
            song2.amountOfNotes = 750 ;
            
            song3.levelDifficulty = "hard";
            song3.amountOfNotes = 454 ;
            
            song4.levelDifficulty = "hard";
            song4.amountOfNotes = 927 ;
        } else {
            if (response.equals("expert")) {
                song1.levelDifficulty = "expert";
                song1.amountOfNotes = 551 ;
                
                song2.levelDifficulty = "expert";
                song2.amountOfNotes = 772 ;
                
                song3.levelDifficulty = "expert";
                song3.amountOfNotes = 491 ;
                
                song4.levelDifficulty = "expert";
                song4.amountOfNotes = 935 ;
            }
            //choose difficulty has the amount of notes for each difficulty
            //for each song that is listed in list songs
        }
        
              

    }//close chooseDifficulty

    public static void  listSongs() {
        System.out.println(song1.title);
        System.out.println(song1.artist);
        System.out.println(song2.title);
        System.out.println(song2.artist);
        System.out.println(song3.title);
        System.out.println(song3.artist);
        System.out.println(song4.title);
        System.out.println(song4.artist);
        //list songs is used to display the song title and artist for the 
        //user to pick from
    }//close listSongs

    public static void chooseSong() {
        Scanner keyboardReader = new Scanner(System.in);
        int response ;
        System.out.println("What song would you like to play? (1-4)");
        listSongs();
        response = keyboardReader.nextInt();
        if (response == 1) {
            choosenSong = song1;
        } else if (response == 2) {
            choosenSong = song2;
        } else if (response == 3) {
            choosenSong = song3;
        } else if (response == 4) {
            choosenSong = song4;
            
        }
        System.out.println("Your choosen song is: " + choosenSong.title  +
                 choosenSong.artist);
        System.out.println("There are " + choosenSong.amountOfNotes + " notes "
                + " in this song");
        //choose song allows the user to choose the song they want to have 
        //information on 
    }
}//close class
