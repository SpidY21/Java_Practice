import java.util.*;
import java.lang.*;
public class Solution5 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char[] arr={'a','e','i','o','u'};
            int flag=0;
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='a'||s.charAt(i)!='e'||s.charAt(i)!='i'||s.charAt(i)!='o'||s.charAt(i)!='u'){
                    flag++;
                    if(flag>=4){
                        break;
                    }
                }
                else{
                    flag=0;
                }
            }
            if(flag>=4){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
