package sorting;
public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {7, 8, 3, 1, 2};

        // selection sort

        for(int i = 0; i < arr.length - 1; ++i){
            int smlst = i;

            for(int j = i + 1; j < arr.length; ++j){
                if(arr[smlst] > arr[j]){
                    smlst = j;
                }
            }
            int temp = arr[smlst];
            arr[smlst] = arr[i];
            arr[i] = temp;
            
        }

        // printing sorted array
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i]+" ");
        }

    }
    
}
