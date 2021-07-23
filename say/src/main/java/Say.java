import java.util.*;

public class Say {
    private static final HashMap<Long, String> units = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(1L, "one"),
            new AbstractMap.SimpleEntry<>(2L, "two"),
            new AbstractMap.SimpleEntry<>(3L, "three"),
            new AbstractMap.SimpleEntry<>(4L, "four"),
            new AbstractMap.SimpleEntry<>(5L, "five"),
            new AbstractMap.SimpleEntry<>(6L, "six"),
            new AbstractMap.SimpleEntry<>(7L, "seven"),
            new AbstractMap.SimpleEntry<>(8L, "eight"),
            new AbstractMap.SimpleEntry<>(9L, "nine")
        )
    );

    private static final HashMap<Long, String> firstTens = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(10L, "ten"),
            new AbstractMap.SimpleEntry<>(11L, "eleven"),
            new AbstractMap.SimpleEntry<>(12L, "twelve"),
            new AbstractMap.SimpleEntry<>(13L, "thirteen"),
            new AbstractMap.SimpleEntry<>(14L, "fourteen"),
            new AbstractMap.SimpleEntry<>(15L, "fifteen"),
            new AbstractMap.SimpleEntry<>(16L, "sixteen"),
            new AbstractMap.SimpleEntry<>(17L, "seventeen"),
            new AbstractMap.SimpleEntry<>(18L, "eighteen"),
            new AbstractMap.SimpleEntry<>(19L, "nineteen")
        )
    );

    private static final HashMap<Long, String> nextTens = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<>(2L, "twenty"),
            new AbstractMap.SimpleEntry<>(3L, "thirty"),
            new AbstractMap.SimpleEntry<>(4L, "forty"),
            new AbstractMap.SimpleEntry<>(5L, "fifty"),
            new AbstractMap.SimpleEntry<>(6L, "sixty"),
            new AbstractMap.SimpleEntry<>(7L, "seventy"),
            new AbstractMap.SimpleEntry<>(8L, "eighty"),
            new AbstractMap.SimpleEntry<>(9L, "ninety")
        )
    );

    String first99(long number) {
        String result = "";

        if (number >= 1 && number <= 9) {
            result = units.get(number);
        } else if (number >= 10 && number <= 19) {
            result = firstTens.get(number);
        } else if (number >= 20 && number <= 99) {
            long auxNumber = number % 10;
            String auxStr = "";

            if (auxNumber != 0)
                auxStr = "-" + units.get(auxNumber);

            result = nextTens.get(number / 10) + auxStr;
        }

        return result;
    }

    String hundreds(long number) {
        long auxNumber = number % 100;
        String auxStr = "";
        
        if (auxNumber != 0)
            auxStr = " " + first99(number % 100);

        return units.get(number / 100) + " hundred" + auxStr;
    }

    String say(long number) {
        if (number == 0)
            return "zero";
        else if (number > 999_999_999_999L || number < 0)
            throw new IllegalArgumentException();

        var result = new StringBuilder("");
        String[] scales = {"", " thousand", " million", " billion"};
        int scaleIndex = 0;

        while (number > 0) {
            long auxNumber = number % 1000;
            
            if (!result.isEmpty())
                result.insert(0, " ");
            
            if (auxNumber != 0)
                result.insert(0, scales[scaleIndex]);

            if (auxNumber >= 1 && auxNumber <= 99) {
                result.insert(0, first99(auxNumber));
            } else if (auxNumber >= 100) {
                result.insert(0, hundreds(auxNumber));
            }

            number /= 1000;
            scaleIndex++;
        }

        return result.toString();
    }
}
