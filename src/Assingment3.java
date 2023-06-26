import java.util.*;

public class Assingment3 {
//    ArrayList<Cake> cake = new ArrayList<>();
//    Cake c1=new Cake();
public static void main(String[] args) {
        ArrayList<Cake> cake = new ArrayList<>();
        ArrayList<Pastry>pastry=new ArrayList<>();
        Cake c1 = new Cake();
        Cake c2 = new Cake();
        c1.setName("Chocolate Brownie");
        c1.setPrice(250.0f);
        c2.setName("Chocolate Maple");
        c2.setPrice(300.0f);
        cake.add(c1);
        cake.add(c2);
        Pastry p1=new Pastry();
        p1.setName("Black Forest");
        p1.setPrice(35.0f);
        Pastry p2=new Pastry();
        p2.setName("Choco Truffle");
        p2.setPrice(40.0f);
        pastry.add(p1);
        pastry.add(p2);

        System.out.println("Today's Special Menu");
        System.out.println("--------------------------------------------------");
        System.out.println("Special Cakes");
        System.out.println("--------------------------------------------------");
        for (Cake value : cake) {
                c1.display(value);
        }
        System.out.println();
        System.out.println();
        System.out.println("Special Pastries");
        System.out.println("--------------------------------------------------");
        for (Pastry value : pastry) {
                p1.display(value);
        }
    }
}
