import java.util.ArrayList;
import java.util.Scanner;

public class Intute {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int plus1=0;
        int minus1=0;
        int p1=Integer.MIN_VALUE;
        int m1=Integer.MIN_VALUE;

        int n=sc.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

//        real code starts -------------------->


        for(int i=0;i<n;i++){
            plus1=0;
            minus1=0;
            for(int j=i;j<n;j++){
                if(a[i]==a[j]-1 || a[i]==a[j]){
                    plus1++;
                    System.out.println("pluss1 = "+plus1);
                }
                else{
                    plus1=1;
                }
                if(a[i]==a[j]+1 || a[i]==a[j]){
                    minus1++;
                    System.out.println("minus1 = "+minus1);
                }
                else{
                    minus1=1;
                }
            }
            if(p1<plus1){
                p1=plus1;
//                System.out.println("p1 = "+p1);
            }
            if(m1<minus1){
                m1=minus1;
//                System.out.println("m1 = "+m1);
            }
        }
        int ans=Math.max(p1,m1);
        System.out.println(ans);
    }
}
