package main.prog1b.ice1;

/**
 * Base class representing an animal.
 */
public class Animal {
    // Protected fields to store IDtag and species information of an animal
    protected int IDtag;
    protected String species;

    // Constructor to initialize IDtag and species of an animal
    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    // Method to print out the IDtag and species information of an animal
    public void output() {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}