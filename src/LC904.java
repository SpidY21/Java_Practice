import java.util.*;
import java.util.HashMap;

public class LC904 {
    public static int totalFruit(int[] fruits){
        int maxpic=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=i;j<fruits.length;j++){
                Set<Integer>s=new HashSet<>();
                for(int k=i;k<=j;k++){
                    s.add(fruits[k]);
                }
                if(s.size()<=2){
                    maxpic=Math.max(maxpic,j-i+1);
                }
            }
        }
        return maxpic;
    }

    public static void main(String[] args) {
        int[]arr=new int[]{3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(arr));
    }
}
