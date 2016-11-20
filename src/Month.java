/**
 * Month enumeration
 */
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    private static Month[] months = values();

    public Month next() {
        return months[(this.ordinal() + 1) % months.length];
    }

    public Month previous() {
        return months[(this.ordinal() + months.length - 1) % months.length];
    }

    public int days() {
        return days(false);
    }

    public int days(boolean leap) {
        int days;
        switch (this) {
            case FEBRUARY:
                days = leap ? 29 : 28;
                break;

            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                days = 30;
                break;

            default:
                days = 31;
                break;
        }

        return days;
    }
}
