/**
 * The Bird class represents a bird with various attributes and behaviors.
 * It includes properties such as color, size, weight, energy level, health, 
 * and a Wing object. The class provides constructors, accessor and mutator 
 * methods, and behavior methods to simulate the bird's actions.
 * 
 * @author Rin Ryu
 * @collaborators CoPILOT
 * @version 11/12/25
 */
public class Bird {

    // Instance variables
    private String color; // The color of the bird
    private double size; // The size of the bird
    private double weight; // The weight of the bird
    private double energyLevel; // The energy level of the bird
    private double health; // The health of the bird
    private Wing wing; // The Wing object representing the bird's wings

    /**
     * Default constructor for Bird.
     * Initializes the bird with default values for all attributes.
     */
    public Bird() {
        this.color = "Unknown"; // Default color
        this.size = 0.0; // Default size
        this.weight = 0.0; // Default weight
        this.energyLevel = 100.0; // Default energy level
        this.health = 100.0; // Default health
        this.wing = new Wing(50.0); // Default wing strength
    }

    /**
     * Overloaded constructor for Bird.
     * Allows the creation of a Bird object with specific values for all attributes.
     *
     * @param color       The color of the bird.
     * @param size        The size of the bird.
     * @param weight      The weight of the bird.
     * @param energyLevel The energy level of the bird.
     * @param health      The health of the bird.
     * @param wing        The Wing object representing the bird's wings.
     */
    public Bird(String color, double size, double weight, double energyLevel, double health, Wing wing) {
        this.color = color; // Set the bird's color
        this.size = size; // Set the bird's size
        this.weight = weight; // Set the bird's weight
        this.energyLevel = energyLevel; // Set the bird's energy level
        this.health = health; // Set the bird's health
        this.wing = wing; // Set the bird's Wing object
    }

    // Accessor and mutator methods for each instance variable

    /**
     * Gets the color of the bird.
     *
     * @return The color of the bird.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the bird.
     *
     * @param color The new color of the bird.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the size of the bird.
     *
     * @return The size of the bird.
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the bird.
     *
     * @param size The new size of the bird.
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Gets the weight of the bird.
     *
     * @return The weight of the bird.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the bird.
     *
     * @param weight The new weight of the bird.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the energy level of the bird.
     *
     * @return The energy level of the bird.
     */
    public double getEnergyLevel() {
        return energyLevel;
    }

    /**
     * Sets the energy level of the bird.
     *
     * @param energyLevel The new energy level of the bird.
     */
    public void setEnergyLevel(double energyLevel) {
        this.energyLevel = energyLevel;
    }

    /**
     * Gets the health of the bird.
     *
     * @return The health of the bird.
     */
    public double getHealth() {
        return health;
    }

    /**
     * Sets the health of the bird.
     *
     * @param health The new health of the bird.
     */
    public void setHealth(double health) {
        this.health = health;
    }

    /**
     * Gets the Wing object of the bird.
     *
     * @return The Wing object representing the bird's wings.
     */
    public Wing getWing() {
        return wing;
    }

    /**
     * Sets the Wing object of the bird.
     *
     * @param wing The new Wing object for the bird.
     */
    public void setWing(Wing wing) {
        this.wing = wing;
    }

    // Behavior methods

    /**
     * Makes the bird fly, reducing energy and health.
     * If the bird's energy level and health are both greater than 10,
     * it will fly, reducing energy by 10 and health by 5.
     * Otherwise, it will print a message indicating that the bird is
     * too tired or unhealthy to fly.
     */
    public void fly() {
        // Check if the bird has enough energy and health to fly
        if (energyLevel > 10 && health > 10) {
            energyLevel -= 10; // Reduce energy by 10
            health -= 5;       // Reduce health by 5
            System.out.println("The bird is flying!");
        } else {
            // Print a message if the bird cannot fly
            System.out.println("The bird is too tired or unhealthy to fly.");
        }
    }

    /**
     * Feeds the bird, increasing its energy level.
     * The amount of energy gained depends on the food amount provided.
     *
     * @param foodAmount The amount of food given to the bird. This value is added
     *                   to the bird's current energy level.
     */
    public void eat(double foodAmount) {
        // Increase the bird's energy level by the given food amount
        energyLevel += foodAmount;
        System.out.println("The bird has eaten and gained energy.");
    }

    /**
     * Heals the bird, restoring its health to full (100.0).
     * This method sets the bird's health to the maximum value.
     */
    public void heal() {
        // Set the bird's health to the maximum value
        health = 100.0;
        System.out.println("The bird has been healed to full health.");
    }

    /**
     * Displays the bird's current status by printing its attributes.
     * This method calls the toString() method to generate a string
     * representation of the bird's current state.
     */
    public void displayStatus() {
        // Print the bird's current status using the toString() method
        System.out.println("Bird Status: " + this.toString());
    }

    /**
     * Returns a string representation of the bird.
     * Includes all attributes of the bird, including the wing strength.
     *
     * @return A string describing the bird.
     */
    @Override
    public String toString() {
        // Generate a string representation of the bird
        return "Bird [color = " + color + ", size = " + size + ", weight = " + weight +
                ", energyLevel = " + energyLevel + ", health = " + health +
                ", wingStrength = " + wing.getWingStrength() + "]";
    }
}