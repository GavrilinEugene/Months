/**
 * Month enumeration
 */
public enum Month {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private static Month[] months = values();
    private final int days;

    Month(int daysAmount) {
        this.days = daysAmount;
    }

    public Month next() {
        return months[(this.ordinal() + 1) % months.length];
    }

    public Month previous() {
        return months[(this.ordinal() + months.length - 1) % months.length];
    }

    public int days(boolean leap) {
        return this == FEBRUARY && leap ? 29 : days;
    }
}
