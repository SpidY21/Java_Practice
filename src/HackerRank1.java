import java.util.*;

public class HackerRank1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int d1=0;
        int d2=0;

        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
                if(i==j){
                    d1+=arr[i][j];
//                    d2+=arr[n-1-i][j];
                }
                if(i==n-1-j){
                    d2+=arr[i][j];
                }
            }
        }
        System.out.println(d1);
        System.out.println(d2);
        int ans=Math.abs(d1-d2);
        System.out.println(ans);
    }
}
