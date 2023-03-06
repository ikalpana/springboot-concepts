package enums;

enum Planet {// implicitly extends java.lang.enum
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
}

public class MainClass {
    public static void main(String[] args) {
        Planet2 arry[] = Planet2.values();
        for (Planet2 planet2 : arry) {
            System.out.println(planet2 + " at index " + planet2.ordinal());
        }
        System.out.println(Planet2.valueOf("EARTH"));
    }
}