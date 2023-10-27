/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package domain.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testSortByYear() {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 2022, List.of("Action")),
                new Movie("Movie B", 2021, List.of("Drama")),
                new Movie("Movie C", 2020, List.of("Comedy"))
        );
      MovieSorter a = new MovieSorter();
      a.sortByYear(movies);


        assertEquals(2022, a.sortByYear(movies).get(0).getYear());
        assertEquals(2021, a.sortByYear(movies).get(1).getYear());
        assertEquals(2020, a.sortByYear(movies).get(2).getYear());



    }

    @Test
    public void testSortByTitle() {
        List<Movie> movies = Arrays.asList(
                new Movie("The Movie", 2022, List.of("Action")),
                new Movie("An Awesome Movie", 2021, List.of("Drama")),
                new Movie("Movie of the Year", 2020, List.of("Comedy"))
        );
        MovieSorter a = new MovieSorter();
        List<Movie> SBT = a.sortByTitle(movies);
        assertEquals("An Awesome Movie", SBT.get(0).getTitle());
        assertEquals("The Movie", SBT.get(1).getTitle());
        assertEquals("Movie of the Year", SBT.get(2).getTitle());
    }


}
