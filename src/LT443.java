import java.util.ArrayList;

public class LT443 {
    public int compress(char[] chars) {
        if(chars.length<=2){
            return chars.length;
        }
        ArrayList<Integer> lint=new ArrayList<>();
        ArrayList<Character> lstring=new ArrayList<>();
        for(int i=0;i<chars.length;i++){
            if(!lstring.contains(chars[i])){
                lstring.add(chars[i]);
                lint.add(1);
            }
            else{
                lint.add(lstring.indexOf(chars[i]),lint.get(lstring.indexOf(chars[i])));
            }
        }
        int ans=lstring.size();
        for(int i=0;i<lint.size();i++){
            if(lint.get(i)!=1){
                if(lint.get(i)<10){
                    ans+=1;
                }
                else if(lint.get(i)<100){
                    ans+=2;
                }
                else if(lint.get(i)<1000){
                    ans+=3;
                }
                else{
                    ans+=4;
                }
            }
        }
        return ans;
    }
}
