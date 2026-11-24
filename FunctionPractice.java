import java.util.*;
public class FunctionPractice {

    static int Sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input of 2 numbers
        System.out.print("Enter 1st number: ");
        int i = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int j = sc.nextInt();

        // function call
        System.out.println("Sum = " + Sum(i, j));

        return; // optional

    }
}
