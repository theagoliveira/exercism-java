import java.math.*;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");
        return new BigInteger("1" + "0".repeat(square - 1), 2);
    }

    BigInteger grainsOnBoard() {
        return new BigInteger("1".repeat(64), 2);
    }

}
