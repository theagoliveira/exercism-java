import java.util.regex.Pattern;

class Acronym {
    String acronym;

    Acronym(String phrase) {
        String[] words;

        words = phrase.replace("'", "")
                      .replaceAll("\\p{Punct}", " ")
                      .split(" +");

        acronym = "";
        for (String word : words) {
            acronym += Character.toUpperCase(word.charAt(0));
        }
    }

    String get() {
        return acronym;
    }

}
