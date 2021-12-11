package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

int[] arr={1,2,3,4,5,6,7,8};
int target=7;
int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }


    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
//find array is in ascending or descending order

        boolean isAscending;
        if (arr[start] < arr[end]) {
            isAscending = true;
        } else {
            isAscending = false;
        }


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }



            if (isAscending) {

                if (target < arr[mid]) {
                    end = mid - 1;
                }
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target<arr[mid]){
                   start=mid+1;
                }else {
                    end=mid-1;
                }
            }
        }

        return -1;
    }

}
