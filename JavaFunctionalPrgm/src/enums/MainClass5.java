package enums;
enum Bikes {
    //Declaring the constants of the enum
    ACTIVA{
        @Override
        public void instanceMethod() {
            super.instanceMethod();
            System.out.println("Activa");
        }
    },
    PULSER,
    APACHE,
    VESPA,
    DUKE;
    //Instance variable of the enum
    int i;
    //Constructor of the enum
    Bikes() {}
    //methods of the enum
    public void instanceMethod() {

        System.out.println("This is instance method");
    }
    public static void staticMethod() {
        System.out.println("This is static method");
    }
}
public class MainClass5{
    public static void main(String args[]) {
        Bikes bikes[] = Bikes.values();
        for(Bikes bikes1: bikes) {
            System.out.println(bikes1);
        }
        System.out.println("Value of the variable: "+bikes[0].i);
        bikes[0].instanceMethod();
        Bikes.staticMethod();
    }
}