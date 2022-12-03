package Polymorphism;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        Adventure theAdventure = new Adventure("Star Wars");
        theAdventure.watchMovie();

        Movie theMovie = Movie.getMovie("Sdventure", "Star Wars");
        theMovie.watchMovie();


//        List list = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie2 = Movie.getMovie(type, title);
            movie2.watchMovie();

        }
    }
}
