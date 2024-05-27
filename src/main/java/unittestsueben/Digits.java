package unittestsueben;

public class Digits {

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public boolean shareDigit(int a, int b) {
        if (a < 10 || b < 10 || a > 99 || b > 99) {
            throw new IllegalArgumentException("the numers are not in the range 10 - 99.");
        }
        int x1 = a / 10;
        int x2 = b / 10;
        int x3 = a % 10;
        int x4 = b % 10;

        return x1 == x2 || x3 == x4 || x3 == x2 || x4 == x1;
    }

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public boolean isIn1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        }
        return n >= 1 && n <= 10;
    }

}
