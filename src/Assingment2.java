import java.util.*;

public class Assingment2 {
    static void calculateTax(String name,long income){
        long tax=0;
        if(income>=300000){
            tax=(income*20)/100;
        }
        else if(income>=100000){
            tax=(income*10)/100;
        }
        System.out.println(name+" : ₹ "+tax);
    }
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("----Welcome----");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total person count:");
        int tp=sc.nextInt();
        String[] names=new String[tp];
        long[] salary=new long[tp];
        for(int i=0;i<tp;i++){
            System.out.println("Enter name"+(i+1)+": ");
            names[i]=sc.next();
            System.out.println("Enter "+ names[i]+ "'s Income: ");
            salary[i]=sc.nextLong();
        }
        System.out.println("Names with liable taxes");
        System.out.println("------------------------");
        for(int i=0;i<tp;i++){
            calculateTax(names[i],salary[i]);
        }
    }
}
