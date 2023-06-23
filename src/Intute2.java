import java.util.*;
import java.lang.*;
import java.io.*;

class Intute2{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for(int j=1;j<=q;j++){
            int x=sc.nextInt();
            if(x==1){
                int i=sc.nextInt();
                int a=sc.nextInt();
                arr[i-1]=a;
            }
            else{
                int val=sc.nextInt();
                int c=0;
                for(int i=0;i<n;i++){
                    if(arr[i]%m==val){
                        c+=1;
                    }
                }
                System.out.println(c);
            }
        }
    }
}