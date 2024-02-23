import java.util.ArrayList;

public class MovieCollection {
    ArrayList<Movie> movieList;

    public MovieCollection() {
        movieList = new ArrayList<>();
        //movieList.add()
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieList.add(new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre));

        /* System.out.println("Titlen på filmen: " + movieList.get(0).getTitle());
        System.out.println("Instrueret af " + movieList.get(0).getDirector());
        System.out.println("Er filmen på farve?: " + movieList.get(0).isInColor());
        System.out.println(" "); */
    }

    public void seeMovieList() {
        for (Movie moviePrintOut : movieList) {
            System.out.println(moviePrintOut.toString());
        }
    }

    public void searchMovie(String title) {
        System.out.println("Følgende film passer til din søgning:");
        for (Movie searchingMovie : movieList) {
            if (searchingMovie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(searchingMovie.toString());
            } else if (movieList.isEmpty()) {
                System.out.println("Ingen film passer til din søgning");
            }
        }

    }
}
