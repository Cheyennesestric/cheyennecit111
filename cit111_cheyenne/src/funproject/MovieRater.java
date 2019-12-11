package funproject;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Cheyenne Sestric
 */
public class MovieRater {

    static List<String> movieList;
    static String randomMovie;

    public static void main(String[] args) {
        double responseSets;
        double responsePlot;
        double responseActing;
        double responseSoundtrack;
        int returnedavgRating;
        int responseMovie;
        
        configureMovieList();
        Scanner keyboardReader = new Scanner(System.in);
        System.out.println("****MOVIE RATER****");
        
        System.out.println("The following movie was randomly selected: ");
        
        chooseRandomMovie();
        
        System.out.println(randomMovie);
        
        System.out.println("Have you seen " + randomMovie + " before? (0 = yes"
                + " 1 = no)");
        responseMovie = keyboardReader.nextInt();
        
        while (responseMovie == 1) {
            chooseRandomMovie();
            System.out.println("Have you seen " + randomMovie + " before?(0 "
                    + "= yes 1 = no)");
            responseMovie = keyboardReader.nextInt();
        }

        System.out.println("What would you rate the sets of this movie out of"
                + " 5.0? ");
        responseSets = keyboardReader.nextDouble();

        System.out.println("What would you rate the plot of this movie out"
                + " of 5.0? ");
        responsePlot = keyboardReader.nextDouble();

        System.out.println("What would you rate the quality of acting in this"
                + " movie out of 5.0? ");
        responseActing = keyboardReader.nextDouble();

        System.out.println("What would you rate the soundtrack of this movie"
                + " out of 5.0? ");
        responseSoundtrack = keyboardReader.nextDouble();

        System.out.println("Your over all rating of this movie is... ");
        returnedavgRating = (int) avgRatingMovie(responseSets, responsePlot,
                responseActing, responseSoundtrack);
        
        System.out.println("****" + returnedavgRating + "****");

    }//close main

    public static double avgRatingMovie(double sets,
            double plot,
            double acting,
            double soundtrack) {
        double avgRating = (sets + plot + acting + soundtrack) / 4;

        return avgRating;

    }//close avgRatingMovie

    public static void configureMovieList() {
        movieList = new ArrayList<String>();
        movieList.add("Zombieland");
        movieList.add("Forrest Gump");
        movieList.add("Titanic");
        movieList.add("It (2017)");
        movieList.add("The Hunger Games");
        movieList.add("Pitch Perfect");
        movieList.add("Deadpool");
        movieList.add("Jurassic World");
        movieList.add("Get out");

    }

    public static void chooseRandomMovie() {
        int numMovies;
        Random random = new Random();
        if (movieList != null) {
            numMovies = movieList.size();
            randomMovie = movieList.get(random.nextInt(numMovies));

        }
    }

}//close class
