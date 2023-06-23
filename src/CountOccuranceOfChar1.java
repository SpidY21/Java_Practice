import java.util.*;

public class CountOccuranceOfChar1
{
    static final int MAX_CHAR = 256;
    static void getOccuringChar(int[] arr)
    {
        int count[] = new int[MAX_CHAR];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            count[arr[i]]++;
        }
        int ch[] = new int[arr.length];
        for (int i = 0; i < len; i++)
        {
            ch[i] = arr[i];
            int find = 0;
            for (int j = 0; j <= i; j++)
            {
                if (arr[i] == ch[j])
                    find++;
            }
            if (find == 1)
                System.out.println("The occurrence of "+ arr[i]+ " is: " + arr[i]);
        }
    }

    public static void main(String args[])
    {
        int [] arr={5,5,5,5,5,5,5,5};
        getOccuringChar(arr);
    }
}