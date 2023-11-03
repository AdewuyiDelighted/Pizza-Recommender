package pizza;

import java.util.Scanner;
import static pizza.PizzaRecommender.*;
public class PizzaRecommenderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        welcomePrintOut();
        int size = scanner.nextInt();

        while (size < 1 || size > 3) {

            System.out.println("Invalid input");

            welcomePrintOut();
            size = scanner.nextInt();
        }
        if (size >= 1 && size <= 3){

            superHungryPrintOut();
            int superHungry = scanner.nextInt();

            hungryPrintOut();
            int hungry = scanner.nextInt();

            classicPrintOut();
            int classic = scanner.nextInt();

            int slicesForSuperHungry = superHungrySize(superHungry);
            int slicesForHungry = hungrySize(hungry);
            int slicesForClassic = classicSize(classic);

            int totalNumberOfSlice = totalNumberOfSlices(slicesForSuperHungry, slicesForHungry, slicesForClassic);

            int numberOfBoxes = numberOfBoxes(totalNumberOfSlice, size);

            int remainingSlices = numberOfSlicesRemaining(totalNumberOfSlice, numberOfBoxes, size);

            int price = pricesOfPizzaBoxes(size);
            int pricesOfPizza = price * numberOfBoxes;

            finalPrintOut(totalNumberOfSlice, numberOfBoxes, remainingSlices, pricesOfPizza);


        }
    }
}
