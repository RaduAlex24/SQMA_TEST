import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void shoud_multiply_numbers() {
        Multiplication multiplication = new Multiplication();

        int firstNumber = 5;
        int secondNumber = 2;
        int restult = multiplication.multiply(firstNumber, secondNumber);

        assertEquals(firstNumber * secondNumber, restult);
    }

}
