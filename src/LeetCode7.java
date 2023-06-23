public class LeetCode7 {
    public static void main(String[] args) {
        String [] strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println();
        System.out.println("Code Done");
    }
    public static String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String ans="";
        int i=0;
        int j=0;
            for(i=0;i<strs[0].length();i++){
                for(j=0;j<n-1;j++){
                    if(strs[j].charAt(i)!=strs[j+1].charAt(i) || i>=strs[j].length()){
                        return ans;
                    }
                }
                ans=ans+strs[i].charAt(i);
            }
        return ans;
    }
}
