import java.util.*;

public class Sorting {
    public static void swap(int[]a,int from,int to){
        int temp;
        temp=a[from];
        a[from]=a[to];
        a[to]=temp;
    }
    public static void printOutputOfArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sorted(int[]arr){

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={9,5,8,2,6,8,2,94,26,0,-2};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                swap(arr,i,i+1);
//            }
//        }
        printOutputOfArray(arr);
    }
}
