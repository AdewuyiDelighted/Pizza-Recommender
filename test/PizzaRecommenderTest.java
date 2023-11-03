import org.junit.jupiter.api.Test;
import pizza.PizzaBoxRecommender;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaBoxRecommenderTest {
    @Test
    public void testThatSomethingIsWorking(){
        int result = PizzaBoxRecommender.bigPizza(4);
        assertEquals(0,result);


    }

}
