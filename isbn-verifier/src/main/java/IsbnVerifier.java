class IsbnVerifier {
    boolean isValid(String stringToVerify) {
        if (stringToVerify.matches("^.*[A-Z].{1,}$"))
            return false;

        int[] parsedChars = stringToVerify.chars()
                                          .filter(ch -> (ch >= 48 && ch <= 57) || ch == 88)
                                          .map(ch -> (ch >= 48 && ch <= 57) ? ch - 48 : 10)
                                          .toArray();
                                          
        return parsedChars.length == 10 &&
               calculate(parsedChars) == 0;
    }

    int calculate(int[] numbers) {
        int sum = 0;

        for (int i = 0, j = 10; i < numbers.length; sum += numbers[i++] * j--);

        return sum % 11;
    }
}
