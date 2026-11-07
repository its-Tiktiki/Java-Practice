import java.util.InputMismatchException;
import java.util.Scanner;
public class try_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program ended");
        }

    }
}
