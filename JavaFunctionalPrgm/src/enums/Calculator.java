package enums;

public class Calculator {

    enum Operation {

        PLUS("+") {
            double apply(double a, double b) {
                return a + b;
            }
        },
        MINUS("-") {
            double apply(double a, double b) {
                return a - b;
            }
        },
        TIMES("*") {
            double apply(double a, double b) {
                return a * b;
            }
        },
        DIVIDE("/") {
            double apply(double a, double b) {
                return a / b;
            }
        };

        private final String symbol;

        Operation(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }

        abstract double apply(double x, double y);
    }

    public static void main(String[] args) {

        double x = 5.0;
        double y = 3.0;

        for (Operation op : Operation.values()) {
            System.out.print(x + " ");
            System.out.print(op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(op.apply(x, y));

        }
    }

}
