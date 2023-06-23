import java.util.*;
public class minValue {
    public long minimumValue(long a[],long b[],long n){
        Arrays.sort(a);
        Arrays.sort(b);
        long minSum=0;
        for(int i=0;i<n;i++){
            minSum=minSum+(a[i]*b[b.length-1-i]);
        }
        return minSum;
    }
}
