public class LT1154 {
    public static boolean isLeap(String s){
        String a="";
        for(int i=0;i<4;i++){
            a+=s.charAt(i);
        }
        int a1=Integer.parseInt(a);
        if(((a1 % 4 == 0) && (a1 % 100!= 0)) || (a1%400 == 0)){
            return true;
        }
        return false;
    }
    public static int dayOfYear(String date) {
        int[] days=new int[12];
        days[0]=days[2]=days[4]=days[6]=days[7]=days[9]=days[11]=31;
        days[3]=days[5]=days[8]=days[10]=30;
        if(isLeap(date)){
            days[1]=29;
        }
        else{
            days[1]=28;
        }
        String month=date.substring(5,7);
//        System.out.println(month);
        String din=date.substring(8,10);
//        System.out.println(din);
        int month1=Integer.parseInt(month);
        int ans= Integer.parseInt(din);
        for(int i=0;i<month1-1;i++){
            ans+=days[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
    }
}
