
package pizza;

import static java.lang.Math.ceil;

public class PizzaRecommender {
    public static final int LARGE_SIZE_SLICES = 10;
    public static final int MEDIUM_SIZE_SLICES = 6;
    public static final int SMALL_SIZE_SLICES = 4;

    public static int superHungrySize(int numberOfThem) {
        return numberOfThem * 4;
    }

    public static int hungrySize(int numberOfThem) {
        return numberOfThem * 2;
    }

    public static int classicSize(int numberOfThem) {
        return numberOfThem * 1;
    }

    public static int totalNumberOfSlices(int superHungrySlices, int hungrySlices, int classicSlices) {
        return superHungrySlices + hungrySlices + classicSlices;
    }

    public static int numberOfBoxes(int totalNumberOfSlices, int size) {
        double totalNumberOfBoxes = switch (size) {
            case 1 -> (double) totalNumberOfSlices / LARGE_SIZE_SLICES;
            case 2 -> (double) totalNumberOfSlices / MEDIUM_SIZE_SLICES;
            case 3 -> (double) totalNumberOfSlices / SMALL_SIZE_SLICES;
            default -> 0;
        };
        return (int) ceil(totalNumberOfBoxes);
    }

    public static int numberOfSlicesRemaining(int totalSlices, int numberOfBoxes, int size) {
        int numberOfSlicesRemaining = 0;
        switch (size) {
            case 1 -> numberOfSlicesRemaining = LARGE_SIZE_SLICES * numberOfBoxes - totalSlices;

            case 2 -> numberOfSlicesRemaining = MEDIUM_SIZE_SLICES * numberOfBoxes - totalSlices;

            case 3 -> numberOfSlicesRemaining = SMALL_SIZE_SLICES * numberOfBoxes - totalSlices;

            default -> {
                return 0;
            }
        }

        return numberOfSlicesRemaining;
    }


    public static int pricesOfPizzaBoxes(int size) {
        int pricePerBox = 0;
        switch (size) {
            case 1 -> pricePerBox = 6000;

            case 2 -> pricePerBox = 3000;

            case 3 -> pricePerBox = 1200;
            default -> {
                return 0;
            }
        }
        return pricePerBox;


    }

    public static void welcomePrintOut() {
        System.out.println("""
                ***** WELCOME TO RARE PIZZA *****
                This's a Pizza recommending app,helps to let you know the number of pizza boxes you would need
                                
                Enter the Size of pizza you a want
                1.Large size has 10 slices of delicious pizza
                2.Medium size has 6 slices of delicious pizza
                3.Small size has 4 slices of delicious pizza""");


    }

    public static void superHungryPrintOut() {
        System.out.println("""
                For easy calculation of the number of pizza boxes you would need we have broken down human appetite into three
                                
                Enter the number of superHungry people that would share in your delicious pizza""");
    }

    public static void hungryPrintOut() {
        System.out.println("Enter the number of hungry people that would share in your delicious pizza");
    }

    public static void classicPrintOut() {
        System.out.println("Enter the number of classic people that would share in your delicious pizza");
    }

    public static void finalPrintOut(int totalNumberOfSlice, int numberOfBoxes, int remainingSlices, int pricesOfPizza) {
        System.out.printf("""
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                The total slices of pizza you would need is : %d
                The total number of boxes you need is : %d
                The remaining slices of pizza you have is : %d
                The price of the box(es) of pizza is : %d
                ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                THANKS FOR PATRONAGE
                """,totalNumberOfSlice, numberOfBoxes, remainingSlices, pricesOfPizza);
    }
}
