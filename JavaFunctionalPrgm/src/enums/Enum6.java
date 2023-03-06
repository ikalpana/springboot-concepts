package enums;

enum Direction {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    static {
        System.out.println("static Block");
    }

    {
        System.out.println("instance block");
    }
}

public class Enum6 {
    public static void main(String[] args) {
        Direction direction[] = Direction.values();


    }
}



