package enums;

public class EnumDemo {
    public enum Months {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }

    public static void main(String[] args) {
        System.out.println("The enum values:");
        System.out.println("\n");
        for (Months month_name : Months.values())
            System.out.println(month_name);
    }
}
