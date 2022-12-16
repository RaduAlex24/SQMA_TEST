import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    @Test
    public void shoud_raise_to_power_number() {
        Power powerClass = new Power();

        int expoenet = 2;
        int power = 4;
        int restult = powerClass.raiseToPower(expoenet, power);

        assertEquals(16, restult);
    }

}
