public class EqulibiriumPoint {
    public static int equilibriumPoint(long arr[], int n) {

        for(int i=0;i<arr.length;i++){

            int startingSum=0;
            int lastSum=0;
            for(int a=0;a<i;a++){
                startingSum+=arr[a];
            }
            for(int b=arr.length-1;b>i;b--){
                lastSum+=arr[b];
            }
            if(startingSum==lastSum){
                return i+1;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n=5;
        long arr[]={1,3,5,2,2};
        int k=equilibriumPoint(arr,n);
        System.out.println(k);
    }
}
