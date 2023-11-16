package section_8;

public class NextPolymorphism {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

//        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
//        jaws.watchMovie();

//        Object comedy = Movie.getMovie("C", "Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "AirPlane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknowObject = Movie.getMovie("S", "starWars");
        if (unknowObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknowObject;
            c.watchComedy();
        } else if (unknowObject instanceof Adventure) {
            ((Adventure) unknowObject).watchMovie();
        } else if (unknowObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
