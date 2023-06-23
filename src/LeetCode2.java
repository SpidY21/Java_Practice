import java.util.Scanner;

public class LeetCode2 {
    public static int reverse(int x) {
        long y=0;
        while(x!=0){
            y=y+x%10;
            x=x/10;
            y=y*10;
        }
//        if(y>(Math.pow(2,31)-1) || y<-Math.pow(2,31) || x>(Math.pow(2,31)-1) || x<-Math.pow(2,31)){
//            return 0;
//        }
        y=y/10;
        if(y<Integer.MIN_VALUE||y>Integer.MAX_VALUE){
            return 0;
        }
        return (int)y;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(reverse(x));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
