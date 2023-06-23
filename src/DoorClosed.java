import java.util.Scanner;

public class DoorClosed {

    static void change(int arr[],int index){
        if(arr[index]==0){
            arr[index]=1;
        }
        else{
            arr[index]=0;
        }
    }

    static int[] checkDoorStatus(int N) {
        int []initial=new int[N];
        for(int i=0;i<N;i++){
            initial[i]=0;
        }
        if(N==1){
            change(initial,0);
            return initial;
        }
        for(int i=0;i<N;i++){
            for(int j=1;j<N;j++){
                // initial[i*j];
                if(i*j-1<N && i*j-1>=0) {
                    change(initial, i * j-1);
                }
            }
        }
        return initial;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N=sc.nextInt();
        int []arr=checkDoorStatus(N);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
