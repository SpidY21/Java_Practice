
import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int output=1;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i =0;i<n-1;i++){
            if(nums[i]!=nums[i+1]-1){
                output++;
            }
        }
        System.out.println(output);
    }
}