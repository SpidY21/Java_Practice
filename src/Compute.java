import java.util.*;

public class Compute {
    public String isSubset(long[]a1,long[]a2,long n,long m){
        Arrays.sort(a1);
        Arrays.sort(a2);
        int okOrNot=0;
        for(int i=0;i<a2.length;i++){
            for(int j=0;j<a1.length;j++){
                if(a2[i]==a1[j]){
                    okOrNot++;
                }
            }
        }
        if(okOrNot==a2.length){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Compute c=new Compute();
        long[] a1={10,5,2,23,19};
        long[] a2={19,5,3};
        long n=a1.length;
        long m=a2.length;
        String s= c.isSubset(a1,a2,n,m);
        System.out.println(s);
    }
}
