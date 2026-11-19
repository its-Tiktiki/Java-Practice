import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for(int i = 2; i <= n; ++i){
            fact *= i;
        }

        System.out.print("Factorial : "+ fact);
    }
    
}
