import java.util.Scanner;
public class prime_number {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        if(num < 2)
            
            System.out.println("No prime numbers.");
        else 

            for(int i = 2; i <= num; ++i){
                int count = 0;
                for(int j = 2; j <= i / 2; ++j){
                    if(i % j == 0){
                        count++;
                    }
                }

                if(count == 0){
                    System.out.print(i + " ");
                }
            }


    }
}
