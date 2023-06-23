import java.util.*;
public class LT2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            b.add(nums2[i]);
        }
        List<Integer> c=new ArrayList<>();
        for(int i=0;i<a.size();i++){
            if(b.contains(a.get(i))){
                c.add(a.get(i));
            }
        }
        for(int i=0;i<a.size();i++){
            if(c.contains(a.get(i))){
                a.remove(a.get(i));
            }
        }
        for(int i=0;i<b.size();i++){
            if(c.contains(b.get(i))){
                b.remove(b.get(i));
            }
        }
        List<List<Integer>>ans=new ArrayList<List<Integer>>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
