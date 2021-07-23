import java.util.regex.Pattern;

class LargestSeriesProductCalculator {
    String number;

    LargestSeriesProductCalculator(String inputNumber) {
        number = inputNumber;

        if (Pattern.matches("^.*[\\D].*$", number)) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        int[] digits = number.chars().map(Character::getNumericValue).toArray();

        if (numberOfDigits > digits.length)
            throw new IllegalArgumentException(
                    "Series length must be less than or equal to the length of the string to search.");
        else if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");

        int max = 0;
        int mult;

        for (int i = 0; i <= digits.length - numberOfDigits; i++) {
            mult = 1;
            for (int j = 0; j < numberOfDigits; j++) {
                mult *= digits[i + j];
            }

            if (i == 0 || mult > max)
                max = mult;
        }

        return max;
    }
}
