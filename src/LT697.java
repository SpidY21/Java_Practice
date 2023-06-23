//import java.util.*;
//
//public class LT697 {
//    public int findShortestSubArray(int[] nums) {
//        Map<Integer,Integer> h=new HashMap<>();
//        for (int j : nums) {
//            if (!h.containsKey(j)) {
//                h.put(j, 1);
//            } else {
//                h.put(j, h.get(j) + 1);
//            }
//        }
//        int max=0;
//        int num=0;
//        for(Map.Entry<Integer,Integer> e: h.entrySet()){
//            if(max<e.getValue()){
//                max=e.getValue();
//                num=e.getKey();
//            }
//        }
//        for(int i=0;i<nums.length;i++){
//
//        }
//    }
//}
