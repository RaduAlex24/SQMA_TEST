public class Power {

    public int raiseToPower(int exponent, int power) {
        int newExpoenet = exponent;

        for (int i = 0; i < power - 1; i++) {
            newExpoenet = newExpoenet * exponent;
        }

        return newExpoenet;
    }

}
