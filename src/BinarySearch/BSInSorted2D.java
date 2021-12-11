package BinarySearch;

import java.util.Arrays;

public class BSInSorted2D {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 6, 7}, {7, 8, 9, 12}};

        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));

    }

    private static int[] search(int[][] arr, int target) {
        int row=0;
        int col=arr.length-1;

        while(row<=arr.length ){

            if (arr[row][col] == target) {
                return new int[]{row, col};
            }
            if (arr[row][col]<target){
                row++;
            }else {
                col--;
            }

        }
        return new int[]{-1,-1};
    }









   /* static int[] search2(int[][] arr, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart = (cEnd - cStart) / 2;
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }


    private static int[] search(int[][] arr, int target) {
        int rows = arr.length - 1;
        int cols = arr[0].length;
        if (rows == 1) {
            return search2(arr, 0, 0, cols - 1, target);
        }

        //run the lopp till the two rows remaining
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart = (rEnd-rStart) / 2;
            if (arr[mid][rEnd] == target) {
                return new int[]{mid, rEnd};
            }
            if (arr[mid][rEnd] < target) {
                rStart = mid + 1;
            } else {
                rEnd = mid - 1;
            }
        }
        if (arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if (arr[rStart+1][cMid]==target){
            return new int[]{rStart,cMid};
        }

        return new int[]{-1, -1};
    }
*/



}