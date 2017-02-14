/**
 * Created by yosuk on 2/14/2017.
 */
public class Movie {
    // Data members
    private String title;              // Title of the movie
    private String category;           // Category of the movie

    /**
     * Constructor for this class
     * @param title Title of movie
     * @param category Category of movie
     */
    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    //Getters and Setters

    /**
     * Gets the title of the movie
     * @return Title of movie
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the movie
     * @param title Title of the movie
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the category of the movie
     * @return Category of the movie
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the movie
     * @param category Category of the movie
     */
    public void setCategory(String category) {
        this.category = category;
    }
}
