import java.util.Scanner;

public class p5 {
    public int findCountRangeSum(int numArr[], int size, int left, int right){
        long tmp = 0;
        int count = 0;
        for (int j = 0; j < size; j++){
            tmp = 0;
            for (int i = j; i < size; i++){
                tmp = tmp + numArr[i];
                if(tmp >= left && tmp <= right){
                    count = count + 1;
                }
            }
        }
        return count;
    }
    public static void main(String argvs[]){
        p5 obj = new p5();
        int numArr[] = {1, 2, 3, 4, 5, 6, 7};
        int size = numArr.length;
        int left = 2;
        int right = 7;
        int ans = obj.findCountRangeSum(numArr, size, left, right);
        System.out.println("For the input array: ");
        for(int i = 0; i < size; i++){
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
        if(ans != 0){
            System.out.print("The number of ranges whose sum lies between "+ left + " & " + right + " is " + ans + ".");
        }
        else{
            System.out.print("There is no range whose sum lies between "+ left + " & " + right + ".");
        }
        System.out.println("\n");
        int numArr1[] = {11, 12, 13, 14, 15, 16, 17};
        size = numArr1.length;
        left = 9;
        right = 10;
        ans = obj.findCountRangeSum(numArr1, size, left, right);
        System.out.println("For the input array: ");
        for(int i = 0; i < size; i++){
            System.out.print(numArr1[i] + " ");
        }
        System.out.println();
        if(ans != 0){
            System.out.print("The number of ranges whose sum lies between "+ left + " & " + right + " is " + ans + ".");
        }
        else{
            System.out.print("There is no range whose sum lies between "+ left + " & " + right + ".");
        }
    }
}
