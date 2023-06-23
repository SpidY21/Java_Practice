import java.util.Scanner;

public class LeetCode4 {
    public static int trailingZeroes(int n) {
        int count=0;
        if(n<5){
            return 0;
        }
        for(int j=5;j<=n;j=j*5){
            for(int i=5;i<=n;i++){
                if(i%j==0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(trailingZeroes(n));
    }
}
