import java.util.Collections;
import java.util.PriorityQueue;

public class LT2239 {
    public int findClosestNumber(int[] nums) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        PriorityQueue<Integer> n=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n.add(nums[i]);
            }
            else{
                p.add(nums[i]);
            }
        }
        if(Math.abs(p.peek())==Math.abs(n.peek())){
            return p.peek();
        }
        else if(Math.abs(p.peek())>Math.abs(n.peek())){
            return n.peek();
        }
        return p.peek();
    }
}
