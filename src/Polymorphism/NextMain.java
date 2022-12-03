package Polymorphism;

public class NextMain {

    public static void main(String[] args) {
        Movie movie2 = Movie.getMovie("A", "Jaws");
        movie2.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Adventure jaws2 = (Adventure) Movie.getMovie("C", "Jaws");
        jaws2.watchMovie();

//        Object comedy = Movie.getMovie("C", "Airplane");
//        comedy.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Movie comedyMovie = (Comedy) comedy;
        comedyMovie.watchMovie();
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("c", "Airplane");
        airplane.watchMovie();

        var plane =  new Comedy("Airplane");
        plane.watchComedy();
    }
}
