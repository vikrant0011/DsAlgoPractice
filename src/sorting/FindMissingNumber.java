package sorting;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 4, 5,6, 7};
        //sort(arr);
      findNumber(arr);
          System.out.println(findNumber(arr));
        //find missing number

    }

    private static int findNumber(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index] !=index){
           return index;
            }
        }
return arr.length;
    }

    private static void swap(int[] arr, int j, int last) {
        int temp = arr[j];
        arr[j] = arr[last];
        arr[last] = temp;
    }

}
