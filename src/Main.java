import java.util.*;

public class Main {
    public static void main(String[] args) {
         Movie movie = new Movie();
        Director director = new Director();

       ArrayList<Director> directors = new ArrayList<>(Arrays.asList(
               new Director("Logan", "Poll"),
               new Director("Werner", "Herzog"),
               new Director("Alexia", "Fast"),
               new Director("Joseph", "Sikora"),
               new Director("Richard", "Jenkins")));

        ArrayList<Cast> casts = new ArrayList<>(Arrays.asList(
                new Cast("Tom Hardy", "Eddie Brock"),
                new Cast("Scott Adkins", "Worrior"),
                new Cast("Jackie Chan", "Main role"),
                new Cast("Tom Hardy", "Main role"),
                new Cast("Bruce Lee", "Main role")));

        ArrayList<Movie> movies = new ArrayList<>(Arrays.asList(
                new Movie("Eddie Brock and Venom", 2020,new Director("Werner", "Herzog"), new ArrayList<>(List.of(new Cast("Tom Hardy", "Eddie Brock")))),
                new Movie("Boyka is back", 2017, new Director("Logan", "Poll"), new ArrayList<>(List.of(new Cast("Scott Adkins", "Worrior")))),
                new Movie("My Story", 2015,new Director("Alexia", "Fast"), new ArrayList<>(List.of(new Cast("Jackie Chan", "Main role")))),
                new Movie("Al Capone", 2025,new Director("Joseph", "Sikora"), new ArrayList<>(List.of(new Cast("Tom Hardy", "Main role")))),
                new Movie("A Warrior's Journey", 2022,new Director("Richard", "Jenkins"), new ArrayList<>(List.of(new Cast("Bruce Lee", "Main role")))) ));

        while (true) {
            System.out.println("=============== Comands ===============");
            System.out.println("Press 1 to print cotalog");
            System.out.println("press 2 to find a movie by full or part name");
            System.out.println("press 3 to sort by year");
            System.out.println("press 4 to sort by name");
            System.out.println("press 5 to sort by director");
            System.out.println("press 6 to find movies by actor's name");
            System.out.println("press 7 to find movies by director's name");
            System.out.println("press 8 to find movies by year");
            System.out.println("press 9 to list all movies and roles by actor's name");
            System.out.println("press 10 to sort list of all actors with his role");
            System.out.println("======================================================");
            Scanner scanner = new Scanner(System.in);
            int str = scanner.nextInt();
            switch (str) {
                case 1:
                    movie.getAllMovies(movies);
                    break;
                case 2:
                    movie.findMovieByName(movies);
                    break;
                case 3:
                    movie.sortByYear(movies);
                    break;
                case 4:
                    movie.sortByMovieName(movies);
                    break;
                case 5:
                    director.sortByDirector(directors);
                    break;
                case 6:
                    movie.findMoiesByActor(casts,movies);
                        break;
                case 7:
                    movie.findMoiesByDirector(movies);
                    break;
                case 8:
                    movie.findMoiesByYear(movies);
                    break;
                case 9:
                    movie.findMoiesByDescription(movies);
                    break;
                case 10:
                    movie.findMoiesByRole(casts);
                    break;
            }
        }
    }
}