package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {


        int[] arr = {7, 6, 5, 4, 3, 2, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j-1);
                }else {
                   break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr [first]=arr[second];
        arr[second]=temp;
    }


}