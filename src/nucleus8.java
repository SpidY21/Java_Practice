import java.util.Scanner;

public class nucleus8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int l=n-1;l>0;l--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                for(int k=1;k<i;k++){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        System.out.println("Done");
    }
}
