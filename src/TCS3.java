import java.lang.reflect.Array;
import java.util.ArrayList;

public class TCS3 {
    public static int maximumSum(int[] arr){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
            i++;
        }
        for(int i=1;i<arr.length;i++){
            sum2+=arr[i];
            i++;
        }
        return Math.max(sum1,sum2);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(maximumSum(arr));
        ArrayList<Integer>l=new ArrayList<>();
    }
}
