import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by yosuk on 2/14/2017.
 */
public class MovieDB {

    private ArrayList<Movie> allMovies;

    /**
     * Constructor, creates a DB using MovieIO, and sorts them in alphabetical order
     */
    public MovieDB() {
        // Variable declarations
        allMovies = new ArrayList<>();
        int index = 1;                      // Index to get a Movie object from MovieIO, note that it is 1 because first
                                            // case is 1

        // Populate the ArrayList
        while (!MovieIO.getMovie(index).getTitle().equalsIgnoreCase("NO SUCH MOVIE")) {
            allMovies.add(new Movie(MovieIO.getMovie(index).getTitle(),MovieIO.getMovie(index).getCategory()));
            ++index;
        }

        // Alphabetize
        alphabetizeList();
    }

    /**
     * Gets the number of movies in the database
     * @return Number of movies in database
     */
    public int getNumMovies() {
        if (allMovies == null) {
            return 0;
        }
        else {
            return allMovies.size();
        }
    }

    /**
     * This method sorts the ArrayList of Movies according to the title property of the Movie object
     * @return True if executed successfully, false otherwise.  
     */
    public boolean alphabetizeList() {

        // Do we need this try/catch??
        try {
            // From Stackoverflow:
            // http://stackoverflow.com/questions/19471005/sorting-an-arraylist-of-objects-alphabetically
            Collections.sort(allMovies, new Comparator<Movie>() {
                public int compare(Movie m1, Movie m2) {
                    return m1.getTitle().compareTo(m2.getTitle());
                }
            });
        }
        catch (Exception e) {
            // Did not execute successfully
            return false;
        }

        // If it got to here, it executed successfully
        return true;
    }


    /**
     * This method prints all the movies in allMovies
     * @param category category of movie to print
     * @return True if executed successfully, false otherwise
     */
    public boolean printMovieCategory(String category) {
        // Variable declarations
        boolean atLeastOneMovie = false;            // Determines if at least one movie of category is found

        // Check to see if the ArrayList exists
        if (allMovies == null) {
            return false;
        }

        // Look for the category in each movie, print if it matches category
        for (Movie movie : allMovies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getTitle());
                atLeastOneMovie = true;   // At least one movie is found with that category
            }
        }

        // If no movie was found, print that there was no movie
        if (!atLeastOneMovie) {
            System.out.println("No movies with that category!");
        }

        // If it gets here, it executed correctly
        return true;
    }

}
