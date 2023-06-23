import java.util.*;

public class LeetCode10 {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer>h=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            String x=s.substring(i,i+10);
            if(h.containsKey(x) && !list.contains(x)){
                list.add(x);
            }
            else{
                h.put(s.substring(i,i+10),1);
            }


        }
        return list;
    }
}
