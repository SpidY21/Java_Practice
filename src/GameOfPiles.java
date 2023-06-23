import java.util.*;

public class GameOfPiles {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            int decreasedOrNot;
            boolean bool=true;
            int last =0;
            while(bool){
                last++;
                decreasedOrNot=0;
                Arrays.sort(a);
                for(int i=0;i<n;i++){
                    if(a[i]%2!=0) {
                        a[i]--;
                        decreasedOrNot++;
                        break;
                    }
                }
                if(decreasedOrNot!=0){
                    a[0]--;
                }
                if(a[0]==0){
                    bool=false;
                }

            }
            if(last%2!=0){
                System.out.println("CHEF");
            }
            else{
                System.out.println("CHEFINA");
            }
        }
    }
}
