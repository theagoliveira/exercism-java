public class Hamming {
    private int length;
    private int hammingDistance;

    public Hamming(String leftStrand, String rightStrand) {
        int llen = leftStrand.length();
        int rlen = rightStrand.length();

        if (llen == 0 && rlen != 0)
            throw new IllegalArgumentException("left strand must not be empty.");
        if (llen != 0 && rlen == 0)
            throw new IllegalArgumentException("right strand must not be empty.");
        if (llen != rlen)
            throw new IllegalArgumentException(
                    "leftStrand and rightStrand must be of equal length.");

        length = llen;
        hammingDistance = 0;
        for (int i = 0; i < length; i++)
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                hammingDistance++;
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
