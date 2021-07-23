class RotationalCipher {
    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        int[] dataArray = data.chars().map(this::shift).toArray();
        return new String(dataArray, 0, dataArray.length);
    }

    int shift(int e) {
        int result = e;

        if (Character.isAlphabetic(e)) {
            result += shiftKey;

            if ((Character.isLowerCase(e) && (result > 'z')) ||
                (Character.isUpperCase(e) && (result > 'Z'))) {
                result -= 26;
            }
        }

        return result;
    }

}
