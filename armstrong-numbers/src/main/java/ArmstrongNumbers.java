class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) {
        int numDigits = Integer.toString(numberToCheck).length();
        int sum = 0;
        int aux = numberToCheck;

        while (aux > 0) {
            sum += Math.pow(aux % 10, numDigits);
            aux /= 10;
        }

        return sum == numberToCheck;
    }

}
