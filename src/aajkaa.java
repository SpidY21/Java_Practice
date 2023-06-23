public class aajkaa {
    public static int anss(int n,int k,int []arr){
//        int n=arr.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int min=arr[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(min<arr[j]){
                    count++;
                }
            }
            if(ans>=k) {
                ans = Math.min(ans, count);
            }
            count=0;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=10;
        int k=10;
        int[] arr={6,6,4,3,4,9,3,2,6,10};
        System.out.println(anss(n,k,arr));
    }
}
