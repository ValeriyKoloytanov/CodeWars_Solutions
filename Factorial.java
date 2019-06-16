import java.util.stream.IntStream;
public class Factorial {
    public int factorial(int n) {
        if (n>12 || n<0) throw new IllegalArgumentException("n must be < 12 ");
        IntStream stream = IntStream.rangeClosed(1, n);
        return stream.reduce(1, (a, b) -> a * b);
    }
}

