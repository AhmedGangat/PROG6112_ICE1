package main.prog1b.ice1;

/**
 * Subclass representing a reptile.
 */
public class Reptile extends Animal {
      // Private field to store the blood temperature of the reptile
    private double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
         // Call the constructor of the base class (Animal) to initialize IDtag and species
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void output() {
         // Call the output method of the base class to display IDtag and species
        super.output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}