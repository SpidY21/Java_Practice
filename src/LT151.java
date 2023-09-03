import java.util.*;
public class LT151 {
    public static String reverseWords(String s) {
        List<String>l=new ArrayList<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(temp!="" && temp!=" ") {
                    l.add(temp);
                }
                temp="";
            }
            else {
                temp += s.charAt(i);
            }
        }
        if(temp!="" && temp!=" ") {
            l.add(temp);
        }
        String ans="";
        for(int i=l.size()-1;i>=0;i--){
            if(l.get(i)!=" ") {
                ans += l.get(i);
            }
            ans+=" ";
        }
//        for(int i=0;i<l.size();i++){
//            System.out.println(l.get(i));
//        }
        String ans1="";
        for(int i=0;i<ans.length()-1;i++){
            ans1+=ans.charAt(i);
        }
        return ans1;
    }

    public static void main(String[] args) {
        String s1="the sky is blue";
        String s2="  hello world  ";
        String s3="a good   example";
        System.out.println(1);
        System.out.println(reverseWords(s1));
        System.out.println(2);
        System.out.println(reverseWords(s2));
        System.out.println(3);
        System.out.println(reverseWords(s3));
    }
}
