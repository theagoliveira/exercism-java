class NaturalNumber {
    private Integer number;

    NaturalNumber(Integer number) {
        if (number <= 0)
            throw new IllegalArgumentException(
                    "You must supply a natural number (positive integer)");

        this.number = number;
    }

    int getAliquotSum() {
        int aliquotSum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0)
                aliquotSum += i;
        }

        return aliquotSum;
    }

    Classification getClassification() {
        return Classification.values()[1 + number.compareTo(getAliquotSum())];
    }
}
