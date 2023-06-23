import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            n=(n+1)/2;
            System.out.println(n*3);
        }
        else{
            n=n/2;
            System.out.println(3*n+5);
        }
    }
}
