import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LeetCode14 {
    public String Name(String[]t,int index){
        String name="";
//        int time=0;
//        int amount=0;
//        String city="";
        int count1=0;
//        String timeS="";
//        String amountS="";

        for(int i=0;i<t[index].length();i++){

            if(t[index].charAt(i)==','){
                count1++;
                String empty="";
            }
            else if(count1==0){
                name+=t[index].charAt(i);
            }
//            else if(count1==1){
//                timeS+=t[index].charAt(i);
//            }
//            else if(count1==2){
//                amountS+=t[index].charAt(i);
//            }
//            else if(count1==3){
//                city+=t[index].charAt(i);
//            }
        }
//        time= Integer.parseInt(timeS);
//        amount= Integer.parseInt(amountS);
        return name;
    }
    public int time(String[]t,int index){
//        String name="";
        int time=0;
//        int amount=0;
//        String city="";
        int count1=0;
        String timeS="";
//        String amountS="";

        for(int i=0;i<t[index].length();i++){

            if(t[index].charAt(i)==','){
                count1++;
                String empty="";
            }
//            else if(count1==0){
//                name+=t[index].charAt(i);
//            }
            else if(count1==1){
                timeS+=t[index].charAt(i);
            }
//            else if(count1==2){
//                amountS+=t[index].charAt(i);
//            }
//            else if(count1==3){
//                city+=t[index].charAt(i);
//            }
        }
        time= Integer.parseInt(timeS);
//        amount= Integer.parseInt(amountS);
    return time;
    }
    public int amount(String[]t,int index){
//        String name="";
//        int time=0;
        int amount=0;
//        String city="";
        int count1=0;
//        String timeS="";
        String amountS="";

        for(int i=0;i<t[index].length();i++){

            if(t[index].charAt(i)==','){
                count1++;
                String empty="";
            }
//            else if(count1==0){
//                name+=t[index].charAt(i);
//            }
//            else if(count1==1){
//                timeS+=t[index].charAt(i);
//            }
            else if(count1==2){
                amountS+=t[index].charAt(i);
            }
//            else if(count1==3){
//                city+=t[index].charAt(i);
//            }
        }
//        time= Integer.parseInt(timeS);
        amount= Integer.parseInt(amountS);
    return amount;
    }
    public String city(String[]t,int index){
//        String name="";
//        int time=0;
//        int amount=0;
        String city="";
        int count1=0;
//        String timeS="";
//        String amountS="";

        for(int i=0;i<t[index].length();i++){

            if(t[index].charAt(i)==','){
                count1++;
                String empty="";
            }
//            else if(count1==0){
//                name+=t[index].charAt(i);
//            }
//            else if(count1==1){
//                timeS+=t[index].charAt(i);
//            }
//            else if(count1==2){
//                amountS+=t[index].charAt(i);
//            }
            else if(count1==3){
                city+=t[index].charAt(i);
            }
        }
//        time= Integer.parseInt(timeS);
//        amount= Integer.parseInt(amountS);
    return city;
    }

    public List<String> invalidTransactions(String[] tra) {
        List<String> ans=new ArrayList<>();
        List<Integer> indexes=new ArrayList<>();
        for(int i=0;i<tra.length;i++){
            if(amount(tra,i)>1000){
                indexes.add(i);
                ans.add(tra[i]);
            }
        }
        for(int i=0;i<tra.length;i++){
            for(int j=i;j<tra.length;j++){
                if(Math.abs(time(tra,i)-time(tra,j))<=60){
                    if((Objects.equals(Name(tra, i), Name(tra, j))) && !Objects.equals(city(tra, i), city(tra, j))){
                        if(!indexes.contains(i) && !ans.contains(tra[i])){
                            ans.add(tra[i]);
                        }
                        if(!indexes.contains(j) && !ans.contains(tra[i])){
                            ans.add(tra[j]);
                        }
                    }
                }
            }
        }
        return ans;
    }

}
