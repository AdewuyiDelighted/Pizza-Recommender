import org.junit.jupiter.api.Test;
import pizza.PizzaRecommender;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaRecommenderTest {
    @Test
    public void testTheInitialNumberOfSlicesForSuperHungrySizes(){
        int result = PizzaRecommender.superHungrySize(1);
        assertEquals(4,result);
    }
    @Test
    public void testTheNumberOSlicesForSuperHungrySizeWhenUserAreMoreThanOne(){
        int result = PizzaRecommender.superHungrySize(3);
        assertEquals(12,result);
    }
    @Test
    public void testTheInitialNumberOfSlicesForHungrySizes(){
        int result = PizzaRecommender.hungrySize(1);
        assertEquals(2,result);
    }
    @Test
    public void testTheNumberOfSlicesWhenHungrySizeUserAreMoreThanOne(){
        int result = PizzaRecommender.hungrySize(4);
        assertEquals(8,result);

    }
    @Test
    public void testTheInitialNumberOFSlicesForClassicSizes(){
        int result = PizzaRecommender.classicSize(1);
        assertEquals(1,result);
    }
    @Test
    public void testTheNumberOfSlicesWhenClassicUserAreMoreThanOne(){
        int result = PizzaRecommender.classicSize(5);
        assertEquals(5,result);
    }
    @Test
    public void testTheTotalNumberOfSlicesWhenUserHaveAllTypesEater(){
        int result = PizzaRecommender.totalNumberOfSlices(12,6,8);
        assertEquals(26,result);
    }
    @Test
    public void testTheTotalWhenThereIsNoClassicEater(){
        int result = PizzaRecommender.totalNumberOfSlices(15,18,0);
        assertEquals(33,result);
    }
    @Test
    public void testTheTotalWhenThereIsNoHungryEater(){
        int result = PizzaRecommender.totalNumberOfSlices(10,0,6);
        assertEquals(16,result);
    }
    @Test
    public void testTheTotalWhenThereIsNoSuperHungryEater(){
        int result = PizzaRecommender.totalNumberOfSlices(0,12,3);
        assertEquals(15,result);
    }
    @Test
    public void testTheNumberOfBoxesNeedIfUserWantSuperHungrySize(){
        int result = PizzaRecommender.numberOfBoxes(15,1);
        assertEquals(2,result);
    }
    @Test
    public void testTheNumberOfBoxesNeedIfUserWantHungrySize(){
        int result = PizzaRecommender.numberOfBoxes(25,2);
        assertEquals(5,result);
    }
    @Test
    public void testTheNumberOfBoxesNeedIfUserWantSmallSize(){
        int result = PizzaRecommender.numberOfBoxes(21,3);
        assertEquals(6,result);
    }
    @Test
    public void testTheRemainingSlicesOFUserThatBoughtSuperHungrySize(){
        int result = PizzaRecommender.numberOfSlicesRemaining(15,2,1);
        assertEquals(5,result);
    }
    @Test
    public void testTheRemainingSlicesOFUserThatBoughtHungrySize(){
        int result = PizzaRecommender.numberOfSlicesRemaining(22,4,2);
        assertEquals(2,result);
    }
    @Test
    public void testTheRemainingSlicesOFUserThatBoughtClassicSize(){
        int result = PizzaRecommender.numberOfSlicesRemaining(17,5,3);
        assertEquals(3,result);
    }
    @Test
    public void testThatZeroWouldBeDisplayIfUserEnterInvalidSize(){
        int result = PizzaRecommender.numberOfSlicesRemaining(12,4,6);
        assertEquals(0,result);
    }



    @Test
    public void testThePriceOfLargeSize(){
        int result = PizzaRecommender.pricesOfPizzaBoxes(1);
        assertEquals(6000,result);
    }
    @Test
    public void testThePriceOfMediumSize(){
        int result = PizzaRecommender.pricesOfPizzaBoxes(2);
        assertEquals(3000,result);

    }
    @Test
    public void testThePriceOfSmallSize(){
        int result = PizzaRecommender.pricesOfPizzaBoxes(3);
        assertEquals(1200,result);
    }

}
