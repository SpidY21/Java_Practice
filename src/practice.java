import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
import java.io.*;

public class practice{
    public static void main(String[] args){
        int a=0;
        float b=0;
        try{
            a=1/0;
        }
        catch (Exception e){
            b=(float)1/0;
//            System.out.println("Try");
        }
        System.out.println(b);
    }
}
