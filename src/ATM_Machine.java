import java.util.*;
public class ATM_Machine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            List<Integer>l=new ArrayList<Integer>();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(k>=a[i]){
                    k=k-a[i];
                    l.add(1);
                }
                else{
                    l.add(0);
                }
            }
            System.out.println(l);
        }
    }
}
