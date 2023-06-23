import java.lang.*;
import java.util.*;
public class GFG_20_July {
    static int countMin(String str){
        List<Integer> list=new ArrayList<Integer>();

        for(int i=0;i<str.length();i++){
            if(str.length()-i-1<str.length() && str.length()-i-1>=0){
                if(str.charAt(i)==str.charAt(str.length()-1-i)){
                    list.add(i);
                }
            }
        }
        if(list.isEmpty()){
            return (str.length()/2)+1;
        }
        Collections.sort(list);
        int at_first= list.get(0);
        int at_last=list.get(list.size()-1);
        int minnum=Math.min(at_first,str.length()-at_last);
//        return minnum;
        if(minnum==0){
            return minnum;
        }
        return minnum+1;
    }

    public static void main(String[] args) {
        String str1="abcd";
        System.out.println(countMin(str1));
        String str2="aa";
        System.out.println(countMin(str2));
        String str3="anasdad";
        System.out.println(countMin(str3));
        String str4="helppreanadkada";
        System.out.println(countMin(str4));
    }
}
