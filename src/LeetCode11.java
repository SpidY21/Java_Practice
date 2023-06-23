import java.util.*;
public class LeetCode11 {
    public static int minimumAverageDifference(int[] nums) {
        int [] arr=new int [nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=Math.abs(average(nums,0,i+1)-average(nums,i+2,nums.length-1));
        }
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(min>arr[i]){
                index=i;
            }
        }
        return index;
    }

    public static int average(int[] arr,int from,int to){
        int length=Math.abs(from-to)+1;
        int sum=0;
        for(int i=from;i<to+1;i++){
            sum+=arr[i];
        }
        return sum/length;
    }

    public static void printArray(int []arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={2,5,3,9,5,3};
//        int[] arr={0};
        System.out.println(minimumAverageDifference(arr));
    }
}
