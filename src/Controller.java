import java.util.ArrayList;

public class Controller {
    MovieCollection movieCollection;

    public Controller() {
        movieCollection = new MovieCollection();
    }


    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

    }

    public void seeMovieList() {
        movieCollection.seeMovieList();
    }

    public void searchMovie(String title) {
        movieCollection.searchMovie(title);
    }
}
