public class GFG2 {
    public static void rearrange(long arr[], int n){
        for(int i=0;i<n;i++){
            bubble(arr.length-1,i,arr);
            i++;
        }
    }
    public static void bubble(int from,int to, long[] arr){
        long temp1=arr[from];
        for(int i= arr.length-1;i>to;i--){
            arr[i]=arr[i-1];
        }
        arr[to]=temp1;
    }
    public static void swap(int a,int b,long[] arr){
        long temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args) {
        int n=8;
        long[] arr={1,2,3,4,5,6,7,8};
        rearrange(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
