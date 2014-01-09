
import java.io.File;
import java.util.Scanner;

/**
 * This class represents a Minesweeper game.
 *
 * @author YOUR NAME <YOUR EMAIL>
 */
public class Minesweeper {

    /** The number of rows in the game grid. */
    private int rows;

    /** The number of columns in the game grid. */
    private int cols;

    /** The number of rounds completed. */
    private int rounds;

    /** The number of mines in the game grid. */
    private int mines;

    /** The displayed game grid. */
    private char[][] displayGrid;

    /** The internal game grid, designating mines. */
    private boolean[][] mineGrid;

    /** Indicates whether or not the game is running. */
    private boolean running;

    
    /** 
     * Returns the next line of user input. This method is provided as a
     * convenience method to the programmer in order to avoid input buffer
     * problems while reading from {@link java.lang.System#in}. It is
     * recommended that the programmer use this method to get the entire line of
     * user input as a {@link java.lang.String} and then 
     * process/interpret/tokenize it using {@link java.lang.String} methods and
     * utility classes such as {@link java.util.StringTokenizer}.
     *
     * @return the next line from standard input.
     */
    public static String getLine() {
	Scanner input = new Scanner(System.in);
	String  line  = input.nextLine();
	return line;
    } // getLine


    /**
     * Constructs an object instance of the {@link Minesweeper} class using the
     * information provided in <code>seedFile</code>. Documentation about the 
     * format of seed files can be found in the project's <code>README.md</code>
     * file.
     *
     * @param seedFile the seed file used to construct the game
     * @see            <a href="https://github.com/mepcotterell-cs1302/cs1302-minesweeper-alpha/blob/master/README.md#seed-files">README.md#seed-files</a>
     */
    public Minesweeper(File seedFile) {

	// use a special init method to set things up
	this.initFromSeedFile(seedFile);

    } // Minesweeper


    /**
     * Constructs an object instance of the {@link Minesweeper} class using the
     * <code>rows</code> and <code>cols</code> values as the game grid's number
     * of rows and columns respectively. Additionally, One quarter (rounded up) 
     * of the squares in the grid will will be assigned mines, randomly.
     *
     * @param rows the number of rows in the game grid
     * @param cols the number of cols in the game grid
     */
    public Minesweeper(int rows, int cols) {

	// use a special init method to set things up
	this.initRandom(rows, cols);

    } // Minesweeper
    

    /** 
     * Draws the game grid based on the current state of the game.
     */
    public void draw() {

	// TODO implement this method

    } // draw


    /**
     * Prompts the player for input, processes their command, and updates the
     * state of the game. If the <code>help</code> command is entered, then
     * the help message should be printed via the {@link #printHelp()} method.
     */
    public void update() {

	// TODO implement this method

	/*
	  NOTE: It is reccommended that you process user input an entire line at
	  a time. To make getting a line easier, a static method has been
	  provided that will return an entire line of user input back as a
	  String. It can be called using Minesweeper.getLine().
	 */

	/*
	  NOTE: You should call the reveal, mark, guess, and printHelp methods
          as needed, based on the player's input.
	 */

    } // update


    /**
     * Initializes a random {@link Minesweeper} game using <code>rows</code>
     * and <code>cols</code> as the number of rows and column, repectively, in
     * the game grid. One quarter (rounded up) of the squares in the game grid 
     * are randomly designated as containing mines.
     *
     * @param rows the number of rows in the game grid
     * @param cols the number of columns in the game grid
     */
    protected void initRandom(int rows, int cols) {

	// TODO implement this method

	/* 
	  NOTE: Take care that actually designate the correct number of mines.
	  It's not as simple as looping a certain number of times and randomly
          updating the mineGrid variable. You need to make sure that you don't
	  accidently place a mine in the same square more than once, which would
	  result in less than the correct number of mines being placed.
	 */

	/*
	  NOTE: When this method is finished, all of the instance variables of 
	  this class must be initialized to some value. It is important to note
	  that at that time, the game is still not yet running.
	*/

    } // initRandom


    /**
     * Initializes the {@link Minesweeper} game using the information
     * provided in <code>seedFile</code>. Documentation about the format of seed
     * files can be found in the project's <code>README.md</code> file.
     *
     * @param seedFile the seed file used to construct the game
     * @see            <a href="https://github.com/mepcotterell-cs1302/cs1302-minesweeper-alpha/blob/master/README.md#seed-files">README.md#seed-files</a>
     */
    protected void initFromSeedFile(File seedFile) {

	// TODO implement this method

	/*
	  NOTE: When this method is finished, all of the instance variables of 
	  this class must be initialized to some value. It is important to note
	  that at that time, the game is still not yet running.
	*/

    } // initFromSeedFile


    /**
     * Reveal the square at position (<code>row</code>, 
     * <code>col</code>).
     *
     * @param row the row index of the square
     * @param col the column index of the square
     */
    protected void reveal(int row, int col) {

	// TODO implement this method

	/*
	  NOTE: Update the displayGrid variable based on the provided method
	  parameters. If a mine is revealed, then call the printGameOver
	  method and exit the program gracefully.
	 */

    } // reveal


    /**
     * Mark the square at position (<code>row</code>, 
     * <code>col</code>) as definitely containing a mine.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     */
    protected void mark(int row, int col) {

	// TODO implement this method

	/*
	  NOTE: Update the displayGrid variable based on the provided method
	  parameters.
	 */

    } // mark


    /**
     * Mark the square at position (<code>row</code>, 
     * <code>col</code>) as potentially containing a mine.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     */
    protected void guess(int row, int col) {

	// TODO implement this method

	/*
	  NOTE: Update the displayGrid variable based on the provided method
	  parameters.
	 */

    } // guess


    /**
     * Returns the calculated score. Refer to the <code>README.md</code> for
     * details about how the score is calculated.
     */ 
    protected int getScore() {

	// TODO implement this method properly
	return 0;

    } // getScore


    /** 
     * Returns whether or not the square at coordinate (<code>row</code>,
     * <code>col</code>) is in the game grid.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     * @return    true if the square is in the game grid; false otherwise
     */
    protected boolean isInGrid(int row, int col) {

	// TODO implement this method properly

	/* 
	   NOTE: Use what you know constitutes a valid grid coordinate in order
	   to return the correct boolean value.
	*/

	return true;

    } // isInGrid


    /** 
     * Returns the number of mines adjacent to the square at coordinate 
     * (<code>row</code>, <code>col</code>) in the game grid.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     * @return    the number of adjacent mines
     */
    protected int countAdjMines(int row, int col) {

	// TODO implement this method properly

	/* 
	   NOTE: You can probably use the isInGrid method to make implementing
	   this method a lot easier.
	*/

	return 0;

    } // countAdjMines


    /**
     * Indicates whether or not the player has won the game. The player wins the 
     * game when both all of the mine locations are marked and when there are no 
     * guessed squares displayes on the game grid. 
     *
     * @return true if the player has wone; false otherwise
     */
    protected boolean isGameWon() {

	// TODO implement this method properly
	return true;

    } // isGameWon


    /**
     * Prints the help text to the screen. This method should print a list of
     * commands available to the user.
     */
    protected void printHelp() {

	// TODO implement this method

    } // printHelp


    /** 
     * Prints the welcome message to the screen.
     */
    protected void printWelcome() {

	System.out.println("        _");
	System.out.println("  /\\/\\ (_)_ __   ___  _____      _____  ___ _ __   ___ _ __");
	System.out.println(" /    \\| | '_ \\ / _ \\/ __\\ \\ /\\ / / _ \\/ _ \\ '_ \\ / _ \\ '__|");
	System.out.println("/ /\\/\\ \\ | | | |  __/\\__ \\\\ V  V /  __/  __/ |_) |  __/ |");
	System.out.println("\\/    \\/_|_| |_|\\___||___/ \\_/\\_/ \\___|\\___| .__/ \\___|_|");
	System.out.println("                                     ALPHA |_| EDITION");

    } // printWelcome

    
    /**
     * Prints the game is won message to the screen, including the number of 
     * rounds completed and the player's final score.
     */
    protected void printGameWon() {

	// TODO implement this method

    } // printGameWon


    /** 
     * Prints the game is over message to the screen.
     */
    protected void printGameOver() {

	// TODO implement this method

    } // printGameOver

    
    /** 
     * Prints an error message to the screen.
     */
    protected void printError(String message) {

	// TODO implement this method

    } // printError


    /**
     * Starts the game and execute the game loop.
     */
    public void run() {

	// TODO update instance variables to indicate the game is running

	// print the welcome message
	this.printWelcome();
    
	// game loop
	while (this.isRunning()) {
	    this.draw();
	    this.update();
	} // while

	// exit gracefully
	System.exit(0);

    } // run


    /**
     * Returns whether or not the game is currently running.
     *
     * @return true if the game is running; false otherwise
     */
    public boolean isRunning() {

	// TODO implement this method properly
	return true;

    } // isRunning


    /**
     * The entry point into the program. This main method does implement some
     * logic for handling command line arguments. If two integers are provided
     * as arguments, then a Minesweeper game is created and started with a 
     * grid size corresponding to the integers provided and with 10% (rounded
     * up) of the squares containing mines, placed randomly. If a single word 
     * string is provided as an argument then it is treated as a seed file and 
     * a Minesweeper game is created and started using the information contained
     * in the seed file. If none of the above applies, then a usage statement
     * is displayed and the program exits gracefully. 
     *
     * @param args the shell arguments provided to the program
     */
    public static void main(String[] args) {

	/*
	  The following switch statement has been designed in such a way that if
	  errors occur within the first two cases, the default case still gets
	  executed. This was accomplished by special placement of the break
	  statements.
	*/

	switch (args.length) {

        // random game
	case 2: 

	    int rows, cols;

	    // try to parse the arguments and create a game
	    try {

		rows = Integer.parseInt(args[0]);
		cols = Integer.parseInt(args[1]);

		Minesweeper game = new Minesweeper(rows, cols);
		game.run();
		break;

	    } catch (NumberFormatException nfe) { 
		// line intentionally left blank
	    } // try

	// seed file game
	case 1: 

	    String filename = args[0];
	    File file = new File(filename);

	    if (file.isFile()) {
		Minesweeper game = new Minesweeper(file);
		game.run();
		break;
	    } // if
    
        // display usage statement
	default:

	    System.out.println("Usage: java Minesweeper [FILE]");
	    System.out.println("Usage: java Minesweeper [ROWS] [COLS]");
	    System.exit(0);

	} // switch

    } // main


} // Minesweeper
