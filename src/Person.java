import java.util.Scanner;

public class Person {
    String name;

    Person(String name){
        this.name=name;
    }
}
class Vehicle extends Person{
    String vehicleName;
    String condition;
    String fuelType;
    String origin;
    Vehicle(String personName,String vehicleName,String condition,String fuelType,String origin){
        super(personName);
        this.vehicleName=vehicleName;
        this.condition=condition;
        this.fuelType=fuelType;
        this.origin=origin;
    }
    void display(Vehicle v){
        System.out.println(v.name+" has a "+v.vehicleName+" in "+v.condition+" condition and has fuel type "+v.fuelType+" available by/from "+v.origin);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter person Name: ");
        String personName=s.next();
        System.out.print("Enter Car name: ");
        String carName=s.next();
        System.out.print("Enter Condition: ");
        String carCondition=s.next();
        System.out.print("Enter Fuel Type: ");
        String carFuelType=s.next();
        System.out.print("Enter Origin: ");
        String carOrigin=s.next();

        Vehicle v1=new Vehicle(personName,carName,carCondition,carFuelType,carOrigin);

        System.out.print("Enter Bike Name: ");
        String bikeName=s.next();
        System.out.print("Enter Condition: ");
        String bikeCondition=s.next();
        System.out.print("Enter Fuel Type: ");
        String bikeFuelType=s.next();
        System.out.print("Enter Origin: ");
        String bikeOrigin=s.next();
        Vehicle v2 = new Vehicle(personName,bikeName,bikeCondition,bikeFuelType,bikeOrigin);

        v1.display(v1);
        v2.display(v2);
    }
}


