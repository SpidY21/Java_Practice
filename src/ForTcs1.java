import java.util.Scanner;

public class ForTcs1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++){
            int flag=0;
            for(int j=0;j<=i;j++){
                if(flag==0) {
                    System.out.print(1+" ");
                    flag = 1;
                }
                else{
                    System.out.print(2+" ");
                    flag=0;
                }
            }
            System.out.println();
        }
    }
}