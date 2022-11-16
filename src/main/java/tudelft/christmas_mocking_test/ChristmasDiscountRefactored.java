package tudelft.christmas;
import java.util.Calendar;

public class ChristmasDiscount {

    private Clock clock;//clock is an interface, for creating a mock using mockito

    public ChristmasDiscount(Clock clock) {
        this.clock = clock;
    }

    public double applyDiscount(double rawAmount) {
        Calendar today = clock.now();

        double discountPercentage = 0;
        boolean isChristmas = today.get(Calendar.DAY_OF_MONTH) == 25 &&
                today.get(Calendar.MONTH) == Calendar.DECEMBER;

        if(isChristmas)
            discountPercentage = 0.15;

        return rawAmount - (rawAmount * discountPercentage);
    }

}
