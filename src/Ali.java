import java.util.Scanner;

public class Ali {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        if((s.charAt(0)+s.charAt(1))%2==0 && (s.charAt(2)!='A'||s.charAt(2)!='I'||s.charAt(2)!='O'
                ||s.charAt(2)!='U'||s.charAt(2)!='E'||s.charAt(2)!='Y')){
            if((s.charAt(3)+s.charAt(4))%2==0 && (s.charAt(4)+s.charAt(5))%2==0){
                if((s.charAt(7)+s.charAt(8))%2==0){
                    System.out.println("valid");
                }
                else{
                    System.out.println("invalid");
                }
            }
            else{
                System.out.println("invalid");
            }
        }
        else{
            System.out.println("invalid");
        }
    }
}
