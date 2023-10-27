package domain.sort;

import java.util.Comparator;
import java.util.List;

public class MovieSorter {


    public  List<Movie> sortByYear(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getYear).reversed());
        return movies;
    }
    public  List<Movie> sortByTitle(List<Movie> movies) {
//        movies.sort(Comparator.comparing(Movie::getTitle));
        movies.sort(Comparator.comparing(movie -> movie.getTitle().replaceFirst("^(?i)(A|An|The) ", "")));
        return movies;
    }

}
