import java.util.*;
public class LT2306 {
    public static long distinctNames(String[] ideas) {
        List<String> l = new ArrayList<>(Arrays.asList(ideas));
        for(int i=0;i<ideas.length;i++){
            for(int j=i+1;j<ideas.length;j++){
                StringBuilder si= new StringBuilder(String.valueOf(ideas[j].charAt(0)));
                StringBuilder sj= new StringBuilder(String.valueOf(ideas[i].charAt(0)));
                for(int k=1;k<ideas[i].length();k++){
                    si.append(ideas[i].charAt(k));
                }
                for(int k=1;k<ideas[j].length();k++){
                    sj.append(ideas[j].charAt(k));
                }
                if(!l.contains(si.toString())){
                    l.add(si.toString());
                }
                if(!l.contains(sj.toString())){
                    l.add(sj.toString());
                }
                System.out.println(l.size());
            }
        }
        return l.size();
    }

    public static void main(String[] args) {
        String[] arr1=new String[]{"coffee","donuts","time","toffee"};
        String[] arr2=new String[]{"lack","back"};
        System.out.println("ans for arr1 = "+distinctNames(arr1));
//        System.out.println("ans for arr2 "+distinctNames(arr2));
    }
}
