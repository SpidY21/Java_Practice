import java.util.*;

public class p3 {
    static int ans1(int[]l) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            arr.add(l[i]);
        }
        if(arr.size()==0){
            return -1;
        }
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(h.containsKey(arr.get(i))){
                h.put(arr.get(i),h.get(arr.get(i))+1);
            }
            else{
                h.put(arr.get(i),1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()%3==0 || e.getValue()%3==2){
                if(e.getValue()%3==0){
                    count+=e.getValue()/3;
                }
                if(e.getValue()%3==2){
                    count+= e.getValue()/3 +1;
                }
            }

            else{
                return -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer>l=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            l.add(sc.nextInt());
        }
//        int a=ans1(l);
//        System.out.println(a);
    }
}
