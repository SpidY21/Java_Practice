import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCode13 {
    public int minimumRound(int[] tasks){
        HashMap <Integer,Integer> h= new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(h.containsKey(tasks[i])){
                int count=h.get(tasks[i]);
                h.put(tasks[i],count+1);
            }
            else{
                h.put(tasks[i],1);
            }
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry: h.entrySet()){
            if(entry.getValue()<2){
                return -1;
            }
            else if(entry.getValue()<3){
                ans += entry.getValue()/2;
            }
            else{
//                if(entry.getValue()%3!=1)
                ans+=entry.getValue()/3+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
