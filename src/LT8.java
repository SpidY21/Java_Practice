public class LT8 {
    public static int myAtoi(String s){
        int sign=1;
        int ans=0;
        for(int i=0;i<s.length();i++){
            try{
                if(s.charAt(i)=='-'){
                    sign=-1;
                }
                else{
                    ans+=Integer.parseInt(String.valueOf(s.charAt(i)));
                    ans=ans*10;
                }
            }
            catch (Exception e){
                if(i==0 && s.charAt(i)!=' '){
                    return 0;
                }
            }
        }
        return ans*sign/10;
    }

    public static void main(String[] args) {
        String s1="4193 with words";
        String s2="   -42";
        String s3="-91283472332";
        System.out.println(myAtoi(s1));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
    }
}
