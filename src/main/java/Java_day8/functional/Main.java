package Java_day8.functional;

public class Main {
    public static void main(String[] args) {
        Myfunctional sum = new Myfunctional() {
            @Override
            public double calculator(double a, double b) {
                return a + b;
            }
        };
        System.out.println("tong 3 va 5 la: " + sum.calculator(3, 5));

        Myfunctional bieuThuc = new Myfunctional() {
            @Override
            public double calculator(double a, double b) {
                return 5 * a + 3 * b -10;
            }
        };
        System.out.println("bieu thuc 5*a + 3*b -10 co ket qua la: " + bieuThuc.calculator(3,6));
    }
}
