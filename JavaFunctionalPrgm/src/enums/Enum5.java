package enums;

enum TrafficSignal {
    //this will call enum constructor with one String argument
    RED("wait"),
    GREEN("go"),
    ORANGE("slow down");

    private String action;

    public String getAction() {
        return this.action;
    }

    // enum constructor - can not be public or protected
    TrafficSignal(String action) {
        this.action = action;
    }
}

public class Enum5 {

    public static void main(String args[]) {

        TrafficSignal[] signals = TrafficSignal.values();
        for (TrafficSignal signal : signals) {
            System.out.println("name : " + signal.name() + " action: " + signal.getAction());
        }

    }

}


