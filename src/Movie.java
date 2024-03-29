public class Movie {

    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lengthInMinutes;
    private String genre;

    public Movie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lengthInMinutes = lengthInMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean isInColor() {
        return isInColor;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Titel: " + title + "\n" + "Længde: " + lengthInMinutes + " Minutter " +
                "\n" + "Director: " + director + "\n" + "Genre: " + genre + "\n" + "Farvefilm: ";
        if (isInColor) {
            result += "Ja";
        } else {
            result += "Nej";
        }
        return result;
    }


}
