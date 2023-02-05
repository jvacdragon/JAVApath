
public class Movie {
    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("The title is: " + title + "\n");
    }

    public static Movie getMovie(String type, String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    Adventure(String title){
        super(title);
    }
}

class Comedy extends Movie{
    Comedy(String title){
        super(title);
    }
}

class ScienceFiction extends Movie{
    ScienceFiction(String title){
        super(title);
    }
}