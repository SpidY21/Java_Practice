import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class faltu1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        double ans=Math.pow(a,1/n);
        System.out.println(ans);
    }
}
