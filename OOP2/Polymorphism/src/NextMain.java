public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("c", "comedy movie");
        movie.watchMovie();

        Comedy c = (Comedy) Movie.getMovie("c", "dsg");

        var airplane = Movie.getMovie("c", "airplane");
        airplane.watchMovie();


        System.out.println(airplane instanceof Comedy);
    }
}
