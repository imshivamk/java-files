import java.util.Scanner;

class Math {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    double dbl1, dbl2;

    public void add(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println(num1+num2);
    }

    public void add(double a, double b) {
        dbl1 = a;
        dbl2 = b;
        System.out.println(dbl1+dbl2);
    }
}

public class mathOverload {
    // PSA
    // I know how to spell "method", mathodOverloading was a sorry attemp at a Pun
   public static void main(String[] args) {
    Math m = new Math();
    m.add(10,20);
    m.add(2.5,7.5);

   }

}
