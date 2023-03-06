package enums;

interface Year {
    public int month();
}
enum Month implements Year {
    JAN,
    FEB,
    MAR,
    APR,
    MAY; //....
    public int month() {
        return ordinal()+1;
    }

}

public class MainClass7 {
    public static void main(String[] args) {
        System.out.println("It is a month Number "+Month.APR.month());
    }
}
