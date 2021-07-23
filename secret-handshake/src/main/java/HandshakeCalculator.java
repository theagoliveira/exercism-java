import java.util.*;

class HandshakeCalculator {
    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();

        for (Signal signal : Signal.values()) {
            if (number % 2 == 1)
                handshake.add(signal);
            number /= 2;
        }

        if (number != 0)
            Collections.reverse(handshake);

        return handshake;
    }
}
