import java.util.*;
public class Distinc_Pair {
    public static int TotalPairs(int[] nums, int k) {
        int ans = 0;
        if(k==0){

            return ans;
        }

        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] - nums[j] == k) {
                    ans++;
                    if(nums[j+1]==nums[j] || nums[i]==nums[i-1]){
                        ans--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1={1,5,4,1,2};
        int k1=0;
        int[] arr2={11,6,10,5,11,16};
        int k2=5;
        int[] arr3={1,5,3};
        int k3=2;
        System.out.println(TotalPairs(arr1,k1));
        System.out.println(TotalPairs(arr2,k2));
        System.out.println(TotalPairs(arr3,k3));
    }
}
