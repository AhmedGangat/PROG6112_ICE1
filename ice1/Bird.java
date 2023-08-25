package main.prog1b.ice1;

/**
 * Subclass representing a bird.
 */
public class Bird extends Animal {
    private String colour;

    public Bird(int IDtag, String species, String colour) {
        super(IDtag, species);
        this.colour = colour;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Colour: " + colour);
    }
}