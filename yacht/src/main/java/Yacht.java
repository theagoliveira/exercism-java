import java.util.*;
import java.util.stream.*;

class Yacht {
    private int score = 0;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        IntStream diceStream = Arrays.stream(dice);
        HashMap<Integer, Integer> count;

        switch (yachtCategory) {
            case YACHT:
                if (diceStream.distinct().count() == 1)
                    score = 50;
                break;
            case ONES:
                score = diceStream.filter(i -> i == 1).sum();
                break;
            case TWOS:
                score = diceStream.filter(i -> i == 2).sum();
                break;
            case THREES:
                score = diceStream.filter(i -> i == 3).sum();
                break;
            case FOURS:
                score = diceStream.filter(i -> i == 4).sum();
                break;
            case FIVES:
                score = diceStream.filter(i -> i == 5).sum();
                break;
            case SIXES:
                score = diceStream.filter(i -> i == 6).sum();
                break;
            case FULL_HOUSE:
                count = new HashMap<>();

                for (int j = 0; j < dice.length; j++)
                    count.put(dice[j], count.getOrDefault(dice[j], 0) + 1);
                if (count.size() == 2 && count.containsValue(3))
                    score = diceStream.sum();
                break;
            case FOUR_OF_A_KIND:
                int maxKey = 0;
                int maxCount = 0;
                int currentCount = 0;

                count = new HashMap<>();

                for (int j = 0; j < dice.length; j++) {
                    currentCount = count.getOrDefault(dice[j], 0) + 1;
                    if (currentCount > maxCount)
                        maxKey = dice[j];
                    count.put(dice[j], currentCount);
                }

                if ((count.size() == 1 && count.containsValue(5))
                        || (count.size() == 2 && count.containsValue(4)))
                    score = 4 * maxKey;
                break;
            case LITTLE_STRAIGHT:
                Arrays.parallelSort(dice);

                if (Arrays.equals(dice, new int[] {1, 2, 3, 4, 5}))
                    score = 30;
                break;
            case BIG_STRAIGHT:
                Arrays.parallelSort(dice);

                if (Arrays.equals(dice, new int[] {2, 3, 4, 5, 6}))
                    score = 30;
                break;
            case CHOICE:
                score = diceStream.sum();
                break;
        }
    }

    int score() {
        return score;
    }

}
