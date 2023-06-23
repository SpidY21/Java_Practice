import java.util.Scanner;

public class Collatz_Conjecture {
    public static long solve(int A, int B) {
        long ans=0;
        long a = A;
        for(int i =2;i<=B;i++)
        {
            if(a%2==0)
            {
                ans = a/2;
                a = ans;
            }
            else
            {
                ans = 3*a+1;
                a=ans;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(solve(a,b));
    }
}
