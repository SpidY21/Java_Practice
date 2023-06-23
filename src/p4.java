import java.util.*;
class p4{

    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<1000;i++){
            if(((39*i) -1)%13==0){
                l.add(i);
            }
        }
        System.out.println(l.size());
//        for(int i=0;i<l.size();i++){
//            System.out.print(l.get(i)+" ");
//        }
    }
}