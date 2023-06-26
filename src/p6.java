import java.io.*;
import java.util.*;
public class p6 {
    public static void main(String[] args){
        String data="Yash Kumar Roy";
        try {
            FileOutputStream fos = new FileOutputStream("file1.txt");
            byte[] byteData = data.getBytes();
            fos.write(byteData);
            fos.close();
        }
        catch (Exception e){
            System.out.println("Error!!!");
            System.out.println(e);
        }
        try {
            FileInputStream fis = new FileInputStream("file1.txt");
            int i=0;
            while((i=fis.read())!=-1){
                System.out.print((char) i);
            }
            fis.close();
        }catch (Exception e){
            System.out.println("Error!!!");
            System.out.println(e);
        }

    }
}
