import java.util.Comparator;
import java.util.List;

public class SortNameZtoA extends Movie implements Comparator<Movie> {
    void sortByMovieNameZtoA(List<Movie> movies){
        SortNameZtoA sortNameZtoA = new SortNameZtoA();
        movies.sort(sortNameZtoA);
        for (Movie m : movies) {
            System.out.println("-----------------------------------------");
            System.out.println(m);
        }

    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
