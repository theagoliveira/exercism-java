import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime dateTime;
    private static final long ONE_GIGA = 1000000000L;

    public Gigasecond(LocalDate moment) {
        dateTime = moment.atStartOfDay().plusSeconds(ONE_GIGA);
    }

    public Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(ONE_GIGA);
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
