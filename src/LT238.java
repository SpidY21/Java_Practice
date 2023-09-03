public class LT238 {
    public int prod(int[] nums,int index){
        int prod=1;
        for(int i=0;i<nums.length;i++){
            if(i!=index){
                prod*=nums[i];
            }
        }
        return prod;
    }
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++){
            p*=nums[i];
        }
        if(p==0) {
            for (int i = 0; i < nums.length; i++) {
                ans[i] = prod(nums, i);
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                ans[i]=p/nums[i];
            }
        }
        return ans;
    }
}
