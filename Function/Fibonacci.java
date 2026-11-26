package Function;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(fibo(n));
    }

    static int fibo(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        // int x = fibo(n-1); 
        // int y = fibo(n-2);

        return fibo(n-1) + fibo(n-2);
    }
    
}
