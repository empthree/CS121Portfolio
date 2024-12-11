package weekThirteen.setAndIteratorActivity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class RealEstateSet {
    Set<String> propertyListings = new HashSet<>();

    public void addProperties() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter property IDs to add (enter '0' to quit):");
        while(true){
            int propertyID = scan.nextInt();
            if (propertyID == 0){
                break;
            } else{
                propertyListings.add(String.valueOf(propertyID));
            }
        }
    }

    public void displayProperties(){

        System.out.println("\n----- PROPERTY LISTINGS -----\n");
        Iterator<String> iter = propertyListings.iterator();

        while (iter.hasNext()){
            String property = iter.next();
            System.out.println(property);
        }
    }
}
