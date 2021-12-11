package sorting;

//when no. given from range in 1 to n then go for cyclic sort

import java.util.Arrays;

public class CyclicSort  {
    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i=0;
        while (i < arr.length){
            int correct=arr[i]-1;
            /*imagine if we have an array like [2,1,4,8,5] on the index 1 we have
           1 and if it is an array with in the range of 1 to n then index 0 is the
           right position of 1
            */

            if (arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
