package enums;

enum Planet2 {// implicitly extends java.lang.enum
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
}

public class MainClass2 {
    public static void main(String[] args) {
        Planet2 arry[] = Planet2.values();// values() method
        for (Planet2 planet2 : arry) {
            System.out.println(planet2 + " at index " + planet2.ordinal());
        }
        System.out.println(Planet2.valueOf("EARTH"));//values of method
        System.out.println((Planet.URANUS.ordinal()));
        Planet2 planet2 = Planet2.EARTH;
        System.out.println(planet2.name());// name() method
        System.out.println(planet2.ordinal());// ordinal() method
        planet2.compareTo(Planet2.EARTH);//compareTo() method
    }
}
