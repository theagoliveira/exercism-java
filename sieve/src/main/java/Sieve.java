import java.util.*;
import java.util.stream.*;

class Sieve {
    int limit;

    Sieve(int maxPrime) {
        limit = maxPrime;
    }

    List<Integer> getPrimes() {
        Integer[] integerArray = IntStream.rangeClosed(2, limit)
                                          .boxed()
                                          .map(Object::toString)
                                          .map(Integer::valueOf)
                                          .toArray(Integer[]::new);
        List<Integer> result = new LinkedList<>(Arrays.asList(integerArray));

        for (int j = 0; j < result.size(); j++) {
            Integer current = result.get(j);
            Integer last = result.get(result.size() - 1);

            for (Integer mult = 2 * current; mult <= last; mult += current)
                result.remove(mult);
        }

        return result;
    }
}
