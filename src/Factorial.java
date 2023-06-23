import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        int factr=1;
        if(n==1){
            return factr;
        }
        factr*=n;
         return fact(n--);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
