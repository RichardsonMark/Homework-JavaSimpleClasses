import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume100AtStart() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasHadDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void hasEmptied() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }
}
