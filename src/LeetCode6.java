import java.util.Scanner;

public class LeetCode6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        double ans =roots(x,n);
        boolean  k=Math.pow(x,1/n)==roots(x,n);
        System.out.println(ans);
        System.out.println(k);
    }

    // a^1/b;
    public static double roots(int a,int b){
        double l=1;
        double r=a;
        double mid=Integer.MIN_VALUE;;
        while(mid!=power(a,b)){
            mid=(l+r)/2;
            if(mid>power(a,b)){
                r=mid;
            }
            if(mid<power(a,b)){
                l=mid;
            }
        }
        return mid;
    }


    public static double power(double a,double b){
        double ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*a;
        }
        return ans;
    }
}
