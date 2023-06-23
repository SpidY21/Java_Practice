import java.util.*;

public class LT389 {
    public static char a(String s,String t){
        List<Character>l=new ArrayList<>();
        char c='a';
        for(int i=0;i<s.length();i++){
            l.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            System.out.println(i+1);
            if(!l.contains(t.charAt(i))){
                c = t.charAt(i);
//                System.out.println(c);
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(a("yash","ayysh"));
    }
}
