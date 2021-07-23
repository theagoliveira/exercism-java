class TwelveDays {
    private static final String[] GIFTS = {
        "a Partridge in a Pear Tree.\n",
        "two Turtle Doves, and ",
        "three French Hens, ",
        "four Calling Birds, ",
        "five Gold Rings, ",
        "six Geese-a-Laying, ",
        "seven Swans-a-Swimming, ",
        "eight Maids-a-Milking, ",
        "nine Ladies Dancing, ",
        "ten Lords-a-Leaping, ",
        "eleven Pipers Piping, ",
        "twelve Drummers Drumming, "
    };
    private static final String[] ORDINAL_NUMS = {
        "first", "second", "third", "fourth", "fifth", "sixth",
        "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private static final String BEGINNING = "On the ";
    private static final String ENDING = " day of Christmas my true love gave to me: ";

    String verse(int verseNumber) {
        StringBuilder result = new StringBuilder();

        result.append(BEGINNING + ORDINAL_NUMS[verseNumber - 1] + ENDING);
        for (int i = verseNumber - 1; i >= 0; result.append(GIFTS[i--]));

        return result.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder result = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            result.append(verse(i));
            if (i != endVerse)
                result.append("\n");
        }

        return result.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}
