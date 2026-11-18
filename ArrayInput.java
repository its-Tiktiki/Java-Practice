import java.util.Scanner;
public class ArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col, row;
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of the array are: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}