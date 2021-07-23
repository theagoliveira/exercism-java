import java.util.*;

class ProteinTranslator {
    private static final HashMap<String, String> codons = new HashMap<>(
        Map.ofEntries(
            new AbstractMap.SimpleEntry<String, String>("AUG", "Methionine"),
            new AbstractMap.SimpleEntry<String, String>("UUU", "Phenylalanine"),
            new AbstractMap.SimpleEntry<String, String>("UUC", "Phenylalanine"),
            new AbstractMap.SimpleEntry<String, String>("UUA", "Leucine"),
            new AbstractMap.SimpleEntry<String, String>("UUG", "Leucine"),
            new AbstractMap.SimpleEntry<String, String>("UCU", "Serine"),
            new AbstractMap.SimpleEntry<String, String>("UCC", "Serine"),
            new AbstractMap.SimpleEntry<String, String>("UCA", "Serine"),
            new AbstractMap.SimpleEntry<String, String>("UCG", "Serine"),
            new AbstractMap.SimpleEntry<String, String>("UAU", "Tyrosine"),
            new AbstractMap.SimpleEntry<String, String>("UAC", "Tyrosine"),
            new AbstractMap.SimpleEntry<String, String>("UGU", "Cysteine"),
            new AbstractMap.SimpleEntry<String, String>("UGC", "Cysteine"),
            new AbstractMap.SimpleEntry<String, String>("UGG", "Tryptophan"),
            new AbstractMap.SimpleEntry<String, String>("UAA", "STOP"),
            new AbstractMap.SimpleEntry<String, String>("UAG", "STOP"),
            new AbstractMap.SimpleEntry<String, String>("UGA", "STOP")
        )
    );

    List<String> translate(String rnaSequence) {
        List<String> result = new ArrayList<>();

        int start = 0;

        while (start <= rnaSequence.length() - 3) {
            String protein = "";
            String codon = rnaSequence.substring(start, start + 3);

            if (codons.containsKey(codon))
                protein = codons.get(codon);

            if (protein.equals("STOP")) {
                break;
            } else {
                result.add(protein);
                start += 3;
            }
        }

        return result;
    }
}
