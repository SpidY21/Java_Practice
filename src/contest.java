public class contest {
    static int pkString(int k, String s) {
        int k1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'){
                k1++;
            }
        }
        if(k1==k){
            return 1;
        }
        return 0;
    }
}
