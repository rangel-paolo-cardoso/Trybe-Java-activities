package program;

public enum Pattern {
    NUMBER_0("A5$2"),
    NUMBER_1("B55S"),
    NUMBER_2("CFFG"),
    NUMBER_3("D&54"),
    NUMBER_4("EEDF"),
    NUMBER_5("FEGG"),
    NUMBER_6("G15E"),
    NUMBER_7("H123"),
    NUMBER_8("I81F"),
    NUMBER_9("JWEF");

    private String pattern;

    Pattern(String pattern) {
        this.pattern = pattern;
    }

    public String get() {
        return pattern;
    }
}
