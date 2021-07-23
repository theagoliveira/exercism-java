import java.util.*;

public class PangramChecker {
    public boolean isPangram(String input) {
        ArrayList<Character> letters = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            Character ch = Character.toLowerCase(input.charAt(i));

            if (!Character.isAlphabetic(ch) || letters.contains(ch))
                continue;

            letters.add(ch);
            if (letters.size() == 26)
                return true;
        }

        return false;
    }
}
