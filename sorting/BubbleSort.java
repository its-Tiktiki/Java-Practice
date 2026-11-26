package sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter lenght of array: ");
        int arr[] = new int[sc.nextInt()];

        for(int i = 0; i < arr.length; ++i){
            System.out.print("Enter arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        // bubble sort
        // time complexity = O(n^2 )

        for(int i = 0; i < arr.length - 1; ++i){
            for(int j = 0; j < arr.length - i - 1; ++j){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // sorted array printing
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
    }
    
}
