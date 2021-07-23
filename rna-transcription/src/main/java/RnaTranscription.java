import java.util.*;

class RnaTranscription {
    private HashMap<Character, String> pairs;

    RnaTranscription() {
        pairs = new HashMap<>();
        pairs.put('C', "G");
        pairs.put('G', "C");
        pairs.put('T', "A");
        pairs.put('A', "U");
    }

    String transcribe(String dnaStrand) {
        var result = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            result.append(pairs.get(dnaStrand.charAt(i)));
        }

        return result.toString();
    }
}
