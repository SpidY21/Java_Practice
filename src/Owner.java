import java.util.*;

public class Owner{
    String ownerName;
}

class VehicleType extends Owner{
    String vehicleName;
}

class FuelType extends VehicleType{
    String fuelName;
}

class Condition extends FuelType{
    String old_New;
}

class Origin extends Condition{
    String indian_imported;
}
class Display{
    Origin o = new Origin();
    Display(Origin o){
        System.out.println(o.ownerName+" has "+o.vehicleName+" has fuel type of "+o.fuelName+" and in "+o.old_New+" condition and made available by "+ o.indian_imported);
    }
}

class MainClass{
    public static void main(String[] args) {
        Origin o1 = new Origin();
        o1.ownerName="Saurabh";
        o1.vehicleName="Honda Accord Car";
        o1.fuelName="Diesel";
        o1.old_New="New";
        o1.indian_imported="India";
        Display d1 = new Display(o1);

        Origin o2 = new Origin();
        o2.ownerName="Saurabh";
        o2.vehicleName="Ducati Bike";
        o2.fuelName="Petrol";
        o2.old_New="Used";
        o2.indian_imported="Imported";
        Display d2 = new Display(o2);
    }
}