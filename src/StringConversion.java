import java.lang.*;
import java.util.*;
public  class StringConversion {
    public char change(char x){
        if('a'<=x && x<='z'){
            return (char)('A'+x-'a');
        }
        return (char)('a'+x-'A');
    }
    public String solve(String A) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < A.length(); ++i){
            str.append(change(A.charAt(i)));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        StringConversion ss=new StringConversion();
        String a="YasH";
        String b="AnkitA";
        System.out.println(ss.solve(a));
        System.out.println(ss.solve(b));
    }
}
