import java.util.Scanner;
public class array_prac {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }


        for(int i = 0; i < 5; i++){
            System.out.println("Number " + (i+1) + " : " + array[i]);
        }


        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println(arr2[i]);
        }


    }
    
}
