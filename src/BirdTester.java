/**
 * The BirdTester class tests the functionality of the Bird and Wing classes.
 * It demonstrates the creation of Bird objects using both the default and 
 * overloaded constructors, and calls various methods to test their behavior.
 * 
 * @author Rin Ryu
 * @collaborators CoPILOT
 * @version 11/12/25
 */
public class BirdTester {

    /**
     * The main method is the entry point of the program.
     * It creates Bird objects, prints their details, and tests their behavior 
     * methods such as eating, flying, and displaying status.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a Bird object using the default constructor
        Bird defaultBird = new Bird();

        // Create a Bird object using the overloaded constructor
        Bird customBird = new Bird("Blue", 1.5, 2.3, 80.0, 90.0, new Wing(70.0));

        // Print the details of each Bird object
        System.out.println(defaultBird); // Calls the toString() method of the defaultBird
        System.out.println(customBird); // Calls the toString() method of the customBird

        // Call the eat method with parameters to increase energy
        defaultBird.eat(20.0); // Default bird eats 20.0 units of food
        customBird.eat(15.0); // Custom bird eats 15.0 units of food

        // Call the fly method to simulate flying
        defaultBird.fly(); // Default bird attempts to fly
        customBird.fly(); // Custom bird attempts to fly

        // Display the current status of each Bird object
        defaultBird.displayStatus(); // Displays the status of the default bird
        customBird.displayStatus(); // Displays the status of the custom bird
    }
}