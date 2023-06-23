import java.util.*;

public class LT67 {
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || carry == 1){
            sum = carry;
            if(i>=0) sum = sum+a.charAt(i)-'0';
            if(j>=0) sum = sum+b.charAt(j)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a1="11";
        String b1="1";
        String a2="1010";
        String b2="1011";
        System.out.println(addBinary(a1,b1));
        System.out.println(addBinary(a2,b2));
    }
}
