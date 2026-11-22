import java.util.Scanner;
class ArrayOperations{
    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2]= new int[5];

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] b = new int[row][];


        int[] oneD = {1, 2, 3, 4, 5};
        int[][] twoD = {

            {1, 2},
            {1, 2}
        };

        int[][][] threeD = {
            {
                {1, 2},
                {3, 4},
            },
            {
                {5, 6},
                {7, 8},
            },
            {
                {9, 10},
                {11, 12},
            }
        };

    }
}