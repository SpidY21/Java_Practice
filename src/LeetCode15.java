import java.util.*;

public class LeetCode15 {
    public static int findJudge(int n, int[][] trust) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<trust.length;i++){
            l1.add(trust[i][0]);
            l2.add(trust[i][1]);
        }
        int ans=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(!l1.contains(i+1) && l2.contains(i+1)){
                ans=i+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int n=3;
        int[][]trust= {{1,3},{2,3},{3,1}};
        System.out.println(findJudge(n,trust));
    }
}
