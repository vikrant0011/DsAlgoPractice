package linear;

public class SearchInRange {
    public static void main(String[] args) {
int []arr={18,12,-7,3,14,28};
int target=3;
        System.out.println(linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<=arr.length;i++){
            if (target==arr[i]){
                return i;
            }
        }
        return -1;
    }


}
