import java.util.Comparator;
import java.util.List;

public class SortNameAtoZ extends Movie implements Comparator<Movie> {

    void sortByMovieNameAtoZ(List<Movie> movies) {
        SortNameAtoZ sortNameAtoZ = new SortNameAtoZ();
        movies.sort(sortNameAtoZ);
        for (Movie m : movies) {
            System.out.println("-----------------------------------------");
            System.out.println(m);
        }

    }


    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
