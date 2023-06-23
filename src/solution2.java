import java.util.Scanner;

public class solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            n=(n-1)/2;
            System.out.println(n*6);
        }
        else{
            n=(n+1)/2;
            n=n-1;
            System.out.println(n*7);
        }
    }
}
