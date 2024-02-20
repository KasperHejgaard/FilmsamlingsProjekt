import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MovieCollection nyliste = new MovieCollection();
        //titel
        System.out.println("Hvad er titlen på filem");
        String title = input.nextLine();

        //director
        System.out.println("Hvem er director på filmen?");
        String director = input.nextLine();

        //yearCreated
        System.out.println("Hvilket år udkom filmen?");
        int yearCreated = input.nextInt();

        //isInColor
        System.out.println("Er filmen på farver?");
        boolean isInColor = input.nextBoolean();

        //lengthInMinutes
        System.out.println("Hvor lang er filmen i minutter?");
        int lengthInMinutes = input.nextInt();

        //Genre
        System.out.println("Hvilken genre er filmen?");
        String genre = input.next();

        nyliste.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

        Movie[] movieList = nyliste.getMovieList();
        System.out.println(movieList[0].getTitle() + " er blevet tilføjet til listen.");

    }
}
