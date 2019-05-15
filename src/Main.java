import exe1.*;
import exe2.Building;
import exe2.Commercial;
import exe2.Resident;
import exe2.Resturant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ex1();
        ex2();
    }

    private static void ex1(){
        ArrayList<Person> ex1Array = new ArrayList<Person>();
        ex1Array.add(new Friend("Didier"));
        ex1Array.add(new Friend("John"));
        ex1Array.add(new Teacher("Kenn"));
        ex1Array.add(new Teacher("Kevin"));
        ex1Array.add(new Doctor("Erin"));
        ex1Array.add(new Doctor("Meka"));

        System.out.println(ex1Array.get(0));
        System.out.println(ex1Array.get(1));
        System.out.println(ex1Array.get(2));
        System.out.println(ex1Array.get(3));
        System.out.println(ex1Array.get(4));
        System.out.println(ex1Array.get(5));
        System.out.println("\n");
    }

    private static void ex2(){
        ArrayList<Building> buildingArray = new ArrayList<Building>();
        buildingArray.add(new Resturant(1,true,true,10));
        buildingArray.add(new Resident(2,false,false,7));
        buildingArray.add(new Commercial(4,true,true,15));

        // Number of buildings
        System.out.println("The realestate agent own "+buildingArray.size()+" building.");

        System.out.println(buildingArray.get(0));
        System.out.println(buildingArray.get(1));
        System.out.println(buildingArray.get(2));
    }
}
