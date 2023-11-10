package sectoin_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("S", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                    "S for ScienceFiction, or Q to quit):");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
