import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie test = new Comedy("TITLE");
        test.watchMovie();

        Movie test2 = new Movie("TITLE2");
        test2.watchMovie();

        Movie test3 = Movie.getMovie("Adventure", "Uncharted");
        test3.watchMovie();

        System.out.println("Enter the movie type: ");
        Scanner scanType = new Scanner(System.in);
        String type = scanType.nextLine();

        System.out.println("Enter the movie title: ");
        Scanner scanTitle = new Scanner(System.in);
        String title = scanTitle.nextLine();

        Movie test4 = Movie.getMovie(type, title);
        test4.watchMovie();
    }
}
