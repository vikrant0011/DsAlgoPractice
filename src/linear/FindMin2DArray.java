package linear;

import java.util.Arrays;

public class FindMin2DArray {
    public static void main(String[] args) {
        int[][] arr = {{18, 12, -7, 3}, {14, 28}, {21, -8, 45}};
        int traget = 18;
        int[] ans = search(arr, traget);
        System.out.println(Arrays.toString(ans));

        System.out.println("maximum value is " +max(arr));
    }

    private static int max(int[][] arr) {
        int max=arr[0][0];
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                if (max<arr[i][j]) {
           max=arr[i][j];
                }
            }
        }
        return max;
    }

/// meri ha h






    private static int[] search(int[][] arr, int traget) {
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                if (arr[i][j] == traget) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }


}

