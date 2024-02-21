import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<>();
        //movieList.add()
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieList.add(new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre));

        System.out.println("Titlen på filmen: " + movieList.get(0).getTitle());
        System.out.println("Instrueret af " + movieList.get(0).getDirector());
        System.out.println(" ");
    }
}
