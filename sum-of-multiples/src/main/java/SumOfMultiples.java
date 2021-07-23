import java.util.*;
import java.util.stream.*;

class SumOfMultiples {
    private int sum = 0;
    private int[] set;

    SumOfMultiples(int number, int[] set) {
        this.set = set;
        sum = IntStream.range(1, number)
                       .filter(this::isMultiple)
                       .sum();
    }

    int getSum() {
        return sum;
    }

    boolean isMultiple(int number) {
        return Arrays.stream(set)
                     .filter(i -> i != 0 && number % i == 0)
                     .count() > 0;
    }

}
