package enums;

public class Enum3 {
    public enum Day {
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN;
    }

    public static void main(String[] args) {
        Day d = null;

        // statement 5.1
        //System.out.println(d.name().equals(Day.MON));
        // it throws an NUllPointerException because "d" is null
        //	at enums
        // statement 5.2
        System.out.println(d == Day.valueOf("TUE"));
        // compiles and it gives false
        //statement 5.3
        System.out.println(d == Day.WED);
        // compiles and it gives false
        //statement 5.4
        switch (d) {
        }
        // it throws an NUllPointerException because "d" is null
        //	at enums
    }
}
