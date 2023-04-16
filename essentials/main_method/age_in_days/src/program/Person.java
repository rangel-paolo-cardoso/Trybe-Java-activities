package program;

public class Person {

    private final int YEARS_DAYS = 365;
    private final int MONTH_DAYS = 30;
    
    public int calculateAgeInDays(int years, int months, int days) {
        return YEARS_DAYS * years + MONTH_DAYS * months + days;
    }
}
