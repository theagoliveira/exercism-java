import java.util.*;

class Scrabble {
    private static final HashMap<Integer, Integer> letters = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'A',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'B',  3),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'C',  3),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'D',  2),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'E',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'F',  4),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'G',  2),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'H',  4),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'I',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'J',  8),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'K',  5),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'L',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'M',  3),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'N',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'O',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'P',  3),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'Q', 10),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'R',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'S',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'T',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'U',  1),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'V',  4),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'W',  4),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'X',  8),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'Y',  4),
            new AbstractMap.SimpleEntry<Integer, Integer>((int) 'Z', 10)
        )
    );
    private int score;

    Scrabble(String word) {
        score = word.chars()
                    .map(Character::toUpperCase)
                    .map(letters::get)
                    .sum();
    }

    int getScore() {
        return score;
    }

}
