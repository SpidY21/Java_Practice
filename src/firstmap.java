import java.util.Scanner;

public class firstmap {
    static long fact(int a){
        long ans=1;
        for(int i=1;i<=a;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s= Integer.toBinaryString(num);
        int ones=0;
        int zeros=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            else{
                zeros++;
            }
        }
        long ans= ((fact(ones+zeros))/(fact(ones)*fact(zeros)));
        System.out.println(ans-1);
    }
}
