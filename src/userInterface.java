import java.util.Scanner;

public class userInterface {

    public void startProgram() {
        Scanner input = new Scanner(System.in);

        Controller nyliste = new Controller();
        int SENTINEL = 4;
        String title;

        int opretEnFilm = 0;
        System.out.println("Velkommen til min filmsamling!");
        while (!(opretEnFilm == SENTINEL)) {
            System.out.println("1. Opret en film");
            System.out.println("2. Se liste over film");
            System.out.println("3. Søg efter film på listen");
            System.out.println("4. Afslut");
            opretEnFilm = input.nextInt();
            input.nextLine();
            if (opretEnFilm == 1) {
                input.nextLine();
                //titel
                System.out.println("Hvad er titlen på filem");
                title = input.nextLine();

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
                input.nextLine();

                //Genre
                System.out.println("Hvilken genre er filmen?");
                String genre = input.next();

                nyliste.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                // Movie[] movieList = nyliste.getMovieList();
                System.out.println(title + " er blevet tilføjet til listen.");
            }
            if (opretEnFilm == 2) {
                nyliste.seeMovieList();
            }
            if (opretEnFilm == 3) {
                System.out.println("Hvilken film vil du søge efter?");
                title = input.nextLine();
                nyliste.searchMovie(title);

            }
            if (opretEnFilm == 4) {
                System.out.println("Du har afsluttet programmet.");
            }
        }
    }
}
