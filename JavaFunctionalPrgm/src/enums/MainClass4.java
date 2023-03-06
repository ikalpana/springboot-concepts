package enums;

enum Fruits {
    APPLE,
    MANGO,
    ORANGE,
    PINEAPPLE

}

public class MainClass4 {
    public static void main(String args[]) {
        Fruits f1, f2, f3;

        // Obtain all ordinal values using ordinal().
        System.out.println("Fruits " + " and their ordinal values: ");
        for (Fruits a : Fruits.values())
            System.out.println(a + " " + a.ordinal());

        f1 = Fruits.APPLE;
        f2 = Fruits.MANGO;
        f3 = Fruits.PINEAPPLE;

        System.out.println();

        // Demonstrate compareTo() and equals()
        if (f1.compareTo(f2) < 0)
            System.out.println(f1 + " comes before " + f2);

        if (f1.compareTo(f2) > 0)
            System.out.println(f2 + " comes before " + f1);

        if (f1.compareTo(f3) == 0)
            System.out.println(f1 + " equals " + f3);
        if (f2.compareTo(f3) < 0)
            System.out.println(f2 + " comes before " + f3);
        if (f1.compareTo(f1) == 0)
            System.out.println(f1 + " equals " + f1);
        if (f1.compareTo(f3) < 0)
            System.out.println(f1 + " comes before " + f3);


    }
}
