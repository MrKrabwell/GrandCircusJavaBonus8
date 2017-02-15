public class Main {

    public static void main(String[] args) {
        // Variables
        MovieDB movieList = new MovieDB();              // MovieDB object that stores all movies
        String userInput;

        // Welcome message
        System.out.println("Welcome to the Movie List Application\n");

        // Keep the program running until user decides to quit
        while (true) {
            //Tell user how many movies there are
            System.out.printf("There are %d movies in this list.\n", movieList.getNumMovies());

            // Ask the user what category they are interested in
            System.out.print("What category are you interested in? ");
            userInput = InputValidator.getString();

            // Print the movies with that category
            System.out.println();
            movieList.printMovieCategory(userInput);
            System.out.println();

            // Ask the user if they want to continue
            System.out.print("Continue? (y/n) ");
            if (!InputValidator.askUserYesNo()) {
                break;
            }
            System.out.println();
        }


        // Exit message
        System.out.println("\nGoodbye!");

    }
}
