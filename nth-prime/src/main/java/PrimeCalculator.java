import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PrimeCalculator {

    int nth(int nth) {
        if (nth == 0)
            throw new IllegalArgumentException();

        boolean isPrime;
        Integer count = 1;
        Integer current = 1;
        List<Integer> primes = new ArrayList<>(Arrays.asList(2));

        while (count < nth) {
            current += 2;
            isPrime = true;

            for (int i = 1; i < primes.size(); i++) {
                if (current % primes.get(i) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(current);
                count++;
            }
        }

        return primes.get(primes.size() - 1);
    }

}
