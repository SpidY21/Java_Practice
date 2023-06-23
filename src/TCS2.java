import java.util.Scanner;

public class TCS2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();
        int pa=360/k;
        int count =0;
        int ia=0,ia1=0;
        int l1=k-b;
        int fl1=0;
        if(l1%2==0){
            fl1=l1/2;
        }
        else{
            fl1=l1/2+1;
        }
        int l2=b-a-1;
        int fl2=0;
        if(l2%2==0){
            fl2=l2/2;
        }
        else{
            fl2=l2/2+1;
        }
        for(int i=1;i<=fl1;i++){
            ia=ia+(180-pa);
            if(ia>90){
                count++;
            }
        }
        for(int i=1;i<=fl2;i++){
            ia1=ia1+pa;
            if(ia1>90){
                count++;
            }
        }
        System.out.println(count);
    }
}
