import java.util.List;

public interface Findable extends Comparable<Movie> {
    List<Movie> getAllMovies(List<Movie>movies);

    void findMovieByName(List<Movie>movies);

    void findMoiesByActor(List<Cast> casts , List<Movie> movies);

    void findMoiesByYear(List<Movie>movies);

    void findMoiesByDirector(List<Movie>movies);

    void findMoiesByDescription(List<Movie> movies);

    void findMoiesByRole(List<Cast>casts);



}

