import java.util.Scanner;

public class ques_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println("A is greater than B");
        }
        else if(a < b){
            System.out.println("A is less than B");
        }
        else{
            System.out.println("A is equal B");
        }
    }
}
