class LuhnValidator {
    boolean isValid(String candidate) {
        int sum = 0;
        int aux;

        candidate = candidate.replace(" ", "");

        if (candidate.matches("^.*[^ 0-9].*$") || candidate.length() < 2)
            return false;

        for (int i = 1; i <= candidate.length(); i++) {
            aux = candidate.charAt(candidate.length() - i) - 48;
            if (i % 2 == 0) {
                aux *= 2;
                sum += (aux > 9 ? aux - 9 : aux);
            } else {
                sum += aux;
            }
        }

        return sum % 10 == 0;
    }
}
