class Proverb {
    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        var result = new StringBuilder("");
        int prev = 0;

        for (int i = 1; i < words.length; i++) {
            result.append(
                    String.format("For want of a %s the %s was lost.%n", words[prev], words[i]));
            prev = i;
        }

        if (words.length != 0)
            result.append(String.format("And all for the want of a %s.", words[0]));

        return result.toString();
    }

}
