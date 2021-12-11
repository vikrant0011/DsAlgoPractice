package linear;

public class FindEvenNoOfDigit {
    public static void main(String[] args) {
int []nums={12,335,2,6,7896};
       // System.out.println(findNumber(nums));
        findEvenOrOdd(nums);
    }

    private static String findEvenOrOdd(int[] nums) {
        for (int num:nums){
            if (num %2==0){
                System.out.println(num+" no is even");
            }else {
                System.out.println(num+" no is add");
            }
        }
return null;
    }

    /* static int findNumber(int[] nums) {
         int count = 0;
         for (int num : nums) {
             if (even(num)) {
                 count++;
             }
         }
         return count;
     }
 */





    //functhion to check wethwr number contain even no of igits or not
    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    //function to count number of digit in a number
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
