package enums;

public class Enum4 {
    public enum Day {
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN;
    }

    public enum Months {
        JAN,
        FEB,
        MAR,
        APR,
        MAY,
        JUN,
        JULY;
    }

    public static void main(String[] args) {
        // Comparing two enum members which are from different enum type
        // using == operator
        //System.out.println(Months.JAN == Day.MON);

        // using .equals() method
        System.out.println(Months.JAN.equals(Day.MON));
    }
}

