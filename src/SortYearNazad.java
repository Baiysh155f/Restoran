import java.util.*;

public class SortYearNazad extends Movie implements Comparator<Movie> {

    public void sprt(List<Movie> movies){
        SortYearNazad sortYearNazad = new SortYearNazad();
        movies.sort(sortYearNazad);
        for (Movie m : movies) {
            System.out.println("-----------------------------------------");
            System.out.println(m);
        }
    }


    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getYear()-o1.getYear();
    }
}
