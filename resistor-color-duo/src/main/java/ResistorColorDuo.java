import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    int value(String[] colors) {
        List<String> colorsList = Arrays.asList(colors());
        return 10 * colorsList.indexOf(colors[0]) + colorsList.indexOf(colors[1]);
    }

    String[] colors() {
        return new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet",
                "grey", "white"};
    }

}
