import java.util.*;
import java.lang.*;
public class Kadane {
    long maxSubarraySum(int arr[], int n){
        int maxSum=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            maxSum+=arr[i];
            if(maxSum<=maxSum+arr[i+1]){
                index=i+1;

            }
        }
        int ans=0;
        for(int i=0;i<=index;i++){
            ans+=arr[i];
        }
//        return maxSum+arr[arr.length-1];
        return ans;
    }
    public static void main(String[] args) {
        int n1=5;
        int[]arr1={1,2,3,-2,5};
        int n2=4;
        int [] arr2={-1,-2,-3,-4};
        int n3=9;
        int [] arr3={-2,1,-3,4,-1,2,1,-5,4};
        Kadane k= new Kadane();
        System.out.println(k.maxSubarraySum(arr1,n1));
        System.out.println(k.maxSubarraySum(arr2,n2));
        System.out.println(k.maxSubarraySum(arr3,n3));
    }
}
