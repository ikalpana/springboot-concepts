package enums;
enum Planet1 {// implicitly extends java.lang.enum
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE,
}

public class MainClass1 {
    public static void main(String[] args) {
        System.out.println("Planet name : index");
        for(Planet1 planet : Planet1.values()){
            System.out.println(planet+ " : "+planet.ordinal()+" ");
        }
    }
}

