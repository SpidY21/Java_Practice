import java.util.Arrays;
import java.util.Scanner;

public class faltu3 {
    public static int smallestPoint(int[] a){
        Arrays.sort(a);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        if(a[a.length-1]>=5){
            return sum-5+1;
        }
        return sum+1-a[a.length-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int ans=smallestPoint(a);
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=a[i];
        }
        System.out.println("Answer is: "+ans);
        System.out.println("Total sum is: "+sum);
    }
}
