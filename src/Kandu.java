import java.util.Arrays;
import java.util.Scanner;

public class Kandu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Arrays.sort(arr);
        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//            System.out.println();
        }
        int k=arr.length;
        System.out.println(arr[0]*arr[1]*arr[k-1]);
        System.out.println(arr[k-1]*arr[k-2]*arr[k-3]);

    }
}
