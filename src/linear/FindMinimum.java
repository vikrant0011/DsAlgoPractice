package linear;

public class FindMinimum {
    public static void main(String[] args) {
        int []arr={18,12,-7,3,14,28};
        System.out.println(minimum(arr));
    }

    private static int minimum(int[] arr) {
        int ans=arr[0];
      for (int i=0;i<=arr.length-1;i++){

          if (arr[i]<ans){
              ans=arr[i];
          }
      }
      return ans;
    }
}
