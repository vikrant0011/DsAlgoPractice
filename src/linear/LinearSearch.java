package linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 55;
        int answer = search(arr, target);
        System.out.println(answer);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
       return -1;
    }

}
