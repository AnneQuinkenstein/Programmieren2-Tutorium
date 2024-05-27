package unittestsueben;

public class Lotterie {

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public int greenTicket(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        }
        if (a == b || a == c || b == c) {
            return 10;
        }
        return 0;
    }

    // TODO schreibe Test
    // denke über Edgecases nach
    // erreiche 100% Coverage
    public int redTicket(Value a, Value b, Value c) {
        if (a.equals(Value.TWO) && b.equals(Value.TWO) && c.equals(Value.TWO)) {
            return 10;
        }
        if (a.equals(b) && a.equals(c)) {
            return 5;
        }
        if (!a.equals(b) && !a.equals(c)) {
            return 1;
        }

        return 0;
    }

    public enum Value {
        ZERO, ONE, TWO
    }
}
