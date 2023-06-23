import java.util.ArrayList;
import java.util.List;

public class p1 {
    static int ans(String s,int n){
        int k=10;
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }
        while(k!=0){
            k=0;
            for (int i = 0; i < l.size() - 1; i++) {
                if (l.get(i) + 1 == l.get(i + 1)) {
                    l.remove(i + 1 - 1);
                    l.remove(i + 1);
                    k++;
                    break;
                }
            }
        }
        return l.size();
    }
    public static void main(String[] args) {
        String s="ACABDBD";
        int n=s.length();
        System.out.println(ans(s,n));
    }
}
