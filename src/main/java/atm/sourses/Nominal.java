package atm.sourses;

/**
 * Используемые банкоматом купюры по номиналу
 */
public enum Nominal {
    ONE_HUNDRED(100),
    TWO_HUNDREDS(200),
    FIVE_HUNDRED(500),
    ONE_THOUSAND(1000),
    TWO_THOUSANDS(2000),
    FIVE_THOUSANDS(5000);

    private int title;

    //Стандартным конструктором...
    Nominal(int title) {
        this.title = title;
    }

    public int getValue() {
        return title;
    }

    public static int getSummaryCount(){
        return Nominal.values().length;
    }
}
