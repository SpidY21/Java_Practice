import java.util.*;

public class GFG3 {
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> l=new ArrayList<Integer>();
        reverse(arr,n);
        int max=arr[0];
        l.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]>=l.get(l.size()-1)){
                l.add(arr[i]);
            }
        }
        return l;
    }
    static void reverse(int a[], int n) {
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=6;
        int [] arr={16,17,4,3,5,2};

        System.out.println(leaders(arr,n));
    }
}
