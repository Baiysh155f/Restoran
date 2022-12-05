import java.util.*;

public class Movie implements Findable {
    private String name;
    private int year;
    private Director director;
    private List<Cast> castList;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, int year, Director director, List<Cast> castList) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.castList = castList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        for (Movie m : movies) {
            System.out.println("-----------------------------------------");
            System.out.println(m);
        }
        return movies;
    }

    @Override
    public void findMovieByName(List<Movie> movies) {

        System.out.println("write to find a movie by full or part name");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getName().contains(str)) {
                System.out.println("-----------------------------------------");
                System.out.println(m);
            } else if (m.getDirector().getName().equals(str)) {
                System.out.println("-----------------------------------------");
                System.out.println(m);
            }
        }
    }

    @Override
    public void findMoiesByActor(List<Cast> casts, List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write name actors");
        String str = scanner.nextLine();
        int i = 0;
        for (Movie m : movies) {
            if (m.getCastList().get(i).getActorFullname().contains(str)) {
                System.out.println("-----------------------------------------");
                System.out.println(m);
            }

        }
    }


    @Override
    public void findMoiesByYear(List<Movie> movies) {
        System.out.println("write year movie");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        for (Movie m : movies) {
            if (m.getYear() == str)
                System.out.println("Movie :" + m.getName() + " Year :" + m.getYear());
            System.out.println("-----------------------------------------");
        }
    }

    @Override
    public void findMoiesByDirector(List<Movie> movies) {
        System.out.println("write name directors");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (Movie m : movies) {
            System.out.println("-----------------------------------------");
            if (m.getDirector().getName().contains(str)) {
                System.out.println(m);
            }
        }

    }


    @Override
    public void findMoiesByDescription(List<Movie> movies) {
        System.out.println(getGet());
        System.out.println("-----------------------------------------");
    }

    public List<Cast> getGet() {
        ArrayList<Cast> casts = new ArrayList<>(Arrays.asList(
                new Cast("Tom Hardy", "Eddie Brock"),
                new Cast("Scott Adkins", "Worrior"),
                new Cast("Jackie Chan", "Main role"),
                new Cast("Tom Hardy", "Main role"),
                new Cast("Bruce Lee", "Main role")));
        for (Cast c : casts
        ) {
            System.out.println("-----------------------------------------");
            System.out.println(c);
        }
        return null;
    }
//    public List<Movie> getNames(){
//        ArrayList<Movie> movies = new ArrayList<>( Arrays.asList(
//                      new Movie("Eddie Brock and Venom"),
//                      new Movie("Boyka is back" ),
//                      new Movie("My Story"),
//                      new Movie("Al Capone"),
//                      new Movie("A Warrior's Journey") ) );
//        for (Movie m:movies) {
//            System.out.println(getName());
//        }
//          return null;
//    }

    @Override
    public void findMoiesByRole(List<Cast> casts) {
        Cast cast = new Cast();
        casts.sort(cast);
        for (Cast m : casts) {
            System.out.println("-----------------------------------------");
            System.out.println(m.getActorFullname() + " " + m.getRole());
        }

    }

    public void sortByYear(List<Movie> movies) {
        System.out.println("press 1 to sort year descending");
        System.out.println("press 2 to sort year ascending");
        SortYearNazad sortYearNazad = new SortYearNazad();
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        switch (str) {
            case 1:
                Collections.sort(movies);
                for (Movie m : movies) {
                    System.out.println("-----------------------------------------");
                    System.out.println(m);
                }
                break;
            case 2:
                sortYearNazad.sprt(movies);
                break;
        }
    }

    public void sortByMovieName(List<Movie> movies) {
        System.out.println("press 1 to sort from A to Z");
        System.out.println("press 2 to sort from Z to A");
        SortNameAtoZ sortNameAtoZ = new SortNameAtoZ();
        SortNameZtoA sortNameZtoA = new SortNameZtoA();
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        switch (str) {
            case 1:
                sortNameAtoZ.sortByMovieNameAtoZ(movies);
                break;
            case 2:
                sortNameZtoA.sortByMovieNameZtoA(movies);
                break;

        }
    }


    @Override
    public String toString() {
        return "Movie :" + name + "\nYear :" + year + "\nDirector :" + director + "\nCast :" + castList;
    }

    @Override
    public int compareTo(Movie o) {
        return getYear() - o.getYear();
    }
}
