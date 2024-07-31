import java.util.Scanner;

class calculator {
    int num1, num2;
    double result;

    public void add() {
        result = num1 + num2;
        System.out.println("the sum is : " + result);
    }

    public void subtract(int x, int y) {
        num1 = x;
        num2 = y;
        result = x - y;
        System.out.println("The sum is : " + result);
    }

    public double multiply() {
        result = (double) num1 * num2;
        return result;
    }

    public double divide(int x, int y) {
        num1 = x;
        num2 = y;
        result = (double) num1 / num2;
        return result;
    }

}

public class myCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();
        while (true) {

            System.out.print("1.add\n2.subtract\n3.multiply\n4.divide\n5.EXIT\n");
            int ch = sc.nextInt();
            System.out.println("enter num1:");
            calc.num1 = sc.nextInt();
            System.out.println("enter num2:");
            calc.num2 = sc.nextInt();
            switch (ch) {
                case 1:
                    calc.add();
                    break;
                case 2:
                    calc.subtract(calc.num1, calc.num2);
                    break;
                case 3:
                    System.out.println("the product is: " + calc.multiply());
                    break;
                case 4:
                    System.out.println("the division is: " + calc.divide(calc.num1, calc.num2));
                    break;
                case 5:
                    System.exit(0);

                default:
                    break;
            }

        }
    }
}