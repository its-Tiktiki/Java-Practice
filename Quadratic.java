
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, x1, x2;

        System.out.print("Enter a, b and c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        d = b * b - 4 * a * c;

        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are real and different");
            System.out.println("Root 1 = " + x1);
            System.out.println("Root 2 = " + x2);
        }
        else if (d == 0) {
            x1 = -b / (2 * a);

            System.out.println("Roots are real and equal");
            System.out.println("Root 1 = Root 2 = " + x1);
        }
        else {
            System.out.println("Roots are imaginary");
        }
    }
}
