import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LeetCode1 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n%3==0 && n%5!=0){
//            System.out.println("Fizz");
//        }
//        else if(n%5==0 && n%3!=0){
//            System.out.println("Buzz");
//        }
//        else if(n%3==0 && n%5==0){
//            System.out.println("FizzBuzz");
//        }
//        else
//            System.out.println(n);
//    }
    public List<String> fizzbuzz(int n){
        List<String> l=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(n%3==0 && n%5!=0){
                l.add("Fizz");
            }
            else if(n%3!=0 && n%5==0){
                l.add("Buzz");
            }
            else if(n%3==0 && n%5==0){
                l.add("FizzBuzz");
            }
            else{
                l.add(Integer.toString(n));
            }
        }
        return l;
    }
}
