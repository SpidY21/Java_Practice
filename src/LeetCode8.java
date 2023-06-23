import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class LeetCode8 {
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer>h= new HashMap<>();

        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i:h.values()){
            if(!hs.contains(i)){
                hs.add(i);
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));

    }
}
