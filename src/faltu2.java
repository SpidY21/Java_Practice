import java.util.Scanner;

public class faltu2 {
    public int getNextElement(int a,int[] b){
        if(b[1]-b[0]==b[2]-b[1]){
            //This is an AP
            int d=b[1]-b[0];
            int an=b[0]+d*(a);
            return an;
        }
        if((double)b[1]/b[0]==(double) b[2]/b[1]){
            int r=b[1]/b[0];
            double an=b[0]*Math.pow(r,a);
            return (int) an;
        }
        if(b[0]+b[1]==b[2]){
            int an=b[a-1]+b[a-2];
            return an;
        }
        return -999;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        faltu2 f=new faltu2();
        int a=sc.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        int ans= f.getNextElement(a,b);
        System.out.println(ans);
    }
}
