import java.util.Scanner;

public class LeetCode3 {
    public static boolean isPalindrome(int x) {
        if(x<0 || x%10==0 && x!=0){
            return false;
        }
        int x1=x;
        long y=0;
        while(x!=0){
            y=y+x%10;
            x=x/10;
            y=y*10;
        }
        y=y/10;
        if(y==x1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
         boolean b= isPalindrome(x);
        System.out.println(b);
    }
}
