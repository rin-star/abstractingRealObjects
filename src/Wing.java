/**
 * The Wing class represents the wings of a bird.
 * It includes a property for the wing's strength and provides methods 
 * to access, modify, and describe the wing's attributes.
 * 
 * @author Rin Ryu
 * @collaborators CoPILOT
 * @version 11/12/25
 */
public class Wing {

    // Instance variable
    private double wingStrength; // The strength of the wing

    /**
     * Constructs a Wing object with the specified wing strength.
     * 
     * @param wingStrength The strength of the wing. This value determines how 
     *                     powerful the wing is.
     */
    public Wing(double wingStrength) {
        this.wingStrength = wingStrength; // Initialize the wing strength
    }

    /**
     * Gets the wing strength.
     * 
     * @return The current strength of the wing.
     */
    public double getWingStrength() {
        return wingStrength; // Return the wing strength
    }

    /**
     * Sets the wing strength.
     * 
     * @param wingStrength The new strength of the wing. This value replaces the 
     *                     current wing strength.
     */
    public void setWingStrength(double wingStrength) {
        this.wingStrength = wingStrength; // Update the wing strength
    }

    /**
     * Returns a string representation of the wing.
     * This method provides a textual description of the wing's attributes.
     * 
     * @return A string describing the wing, including its strength.
     */
    @Override
    public String toString() {
        return "wing [wingStrength = " + wingStrength + "]"; // Generate a string representation
    }
}