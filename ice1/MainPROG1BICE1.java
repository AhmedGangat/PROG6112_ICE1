package main.prog1b.ice1;

import java.util.Scanner;

public class MainPROG1BICE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and creation of Bird object
        System.out.println("Enter Bird details:");
        System.out.println("Enter animal ID:");
        int birdID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter species:");
        String birdSpecies = scanner.nextLine();
        System.out.println("Select colour from: 1. Red, 2. Blue, 3. Green, 4. Yellow, 5. White");
        int birdColourChoice = scanner.nextInt();
        String birdColour = getColor(birdColourChoice);

        // Create a Bird object with the entered details
        Bird brd = new Bird(birdID, birdSpecies, birdColour);
        System.out.println("Bird details:");
        brd.output();

        // Input and creation of Reptile object
        System.out.println("\nEnter Reptile details:");
        System.out.println("Enter animal ID:");
        int reptileID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter species:");
        String reptileSpecies = scanner.nextLine();
        System.out.println("Enter blood temperature:");
        double reptileBloodTemp = scanner.nextDouble();

        // Create a Reptile object with the entered details
        Reptile rept = new Reptile(reptileID, reptileSpecies, reptileBloodTemp);
        System.out.println("\nReptile details:");
        rept.output();
    }

    /**
     * Maps the numerical choice of bird color to its corresponding string value.
     *
     * @param choice The numerical choice of bird color.
     * @return The corresponding string color value.
     */
    public static String getColor(int choice) {
        switch (choice) {
            case 1:
                return "Red";
            case 2:
                return "Blue";
            case 3:
                return "Green";
            case 4:
                return "Yellow";
            case 5:
                return "White";
            default:
                return "Unknown";
        }
    }
}