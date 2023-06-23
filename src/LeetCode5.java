import java.util.Scanner;

public class LeetCode5 {
    public static double myPow(double x, int n)  {
        double ans=1;
        long a=n;
        long a1=a;
        if(n<0){
            a=-a;
        }

        for(int i=1;i<=a;i++){
            ans=ans*x;
        }
        if(a1<0){
            return 1/ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        System.out.println(myPow(x,n));
        System.out.println(Math.pow(x,n));

    }
}
