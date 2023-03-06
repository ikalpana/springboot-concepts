package enums;

public class Enum1 {
    public enum Operation {
        ADD,
        SUB,
        MULTI;


        static final int ADD(int a,int b ){
            return a+b;
        }
        static final int SUB(int x, int y){
            return x-y;
        }
        static final int MULTI(int a , int b){
            return a*b;

        }
        public static void main(String[] args){
            System.out.println("Addition " +Operation.ADD(10,5));
            System.out.println("Substraction "+Operation.SUB(10,5));
            System.out.println("Multiplication "+Operation.MULTI(5,4));

        }

        }
}
