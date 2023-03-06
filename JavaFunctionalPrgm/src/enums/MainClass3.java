package enums;

enum Planet3 {// implicitly extends java.lang.enum
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
}

public class MainClass3 {
    public static void main(String[] args) {

        for (Planet3 planet3 : Planet3.values()) {
            System.out.println(planet3);

        }
    }

}
