package linear;

import java.util.Arrays;

public class SearchString {
    public static void main(String[] args) {
        String name="vikrant";
        char target='k';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    private static boolean search(String name, char target) {
        if (name.length()==0){
            return  false;
        }
       /* for (int i=0;i<=name.length();i++){
            if (target==name.charAt(i)){
                return true;
            }
        }*/
        for(char ch:name.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
