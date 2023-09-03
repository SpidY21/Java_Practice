public class P7 {
    public static int ans(int k,int n,int[] arr){
        int count=0;
        int j=1;
        int sum=0;
        while(count<=k){
            for(int i=0;i<n;i++){
                if(arr[i]%j==0){

                    sum+=j;
                }
                count++;
                j++;
//                else{
//                    break;
//                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        int[]arr={2,3,4,6,5};
        int i=0;
        while(true){
            System.out.println(i++);
        }
//        System.out.println(ans(4,5,arr));
    }
}
