import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Controller nyliste = new Controller();
        int SENTINEL = 4;

        int opretEnFilm = 0;
        System.out.println("Velkommen til min filmsamling!");
        while (!(opretEnFilm == SENTINEL)) {
            System.out.println("1. Opret en film");
            System.out.println("2. Se liste over film");
            System.out.println("3. Søg efter film på listen");
            System.out.println("4. Afslut");
            opretEnFilm = input.nextInt();
            if (opretEnFilm == 1) {
                input.nextLine();
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
                boolean isInColor = false;
                System.out.println("Er filmen på farver?");
                String erIFarve = input.next();
                erIFarve = erIFarve.toLowerCase();
                if (erIFarve.equals("ja")) {
                    isInColor = true;
                }


                //lengthInMinutes
                System.out.println("Hvor lang er filmen i minutter?");
                int lengthInMinutes = input.nextInt();

                //Genre
                System.out.println("Hvilken genre er filmen?");
                String genre = input.next();

                nyliste.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                // Movie[] movieList = nyliste.getMovieList();
                System.out.println(title + " er blevet tilføjet til listen.");
            } else if (opretEnFilm == 2) {
                nyliste.seeListOfMovies();

            } else if (opretEnFilm == 3) {
                System.out.println("Hvilken film vil du søge efter?");
                String searchTerm = input.next();
                nyliste.searchMovie(searchTerm);

            } else{
            System.out.println("Du har afsluttet programmet.");
        }
    }
}
}
