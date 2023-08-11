import java.util.*;

public class LeetCode75 {
        public String reverseVowels(String s) {
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (isVowel(c)) {
                    list.add(c);
                }
            }
            Collections.reverse(list);
            int idx = 0;
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (isVowel(arr[i])) {
                    arr[i] = list.get(idx++);
                }
            }
            return new String(arr);
        }

        private static boolean isVowel(char c) {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
        }

    public static void main(String[] args) {
        LeetCode75 lc75=new LeetCode75();
//        System.out.println(lc75.reverseVowels("yash"));
//        System.out.println(lc75.reverseVowels("kumar"));
//        System.out.println(lc75.reverseVowels("roy"));
        System.out.println(lc75.reverseVowels("leetcode"));
    }
}
