package weekNine;

public class MainPropertyListing {
    public static void main(String[] args) {


        PropertyListing regular = new RegularListing("Apartment, ", "Downtown");
        PropertyListing premium = new PremiumListing("Villa, ", "Uptown, ", "Swimming Pool");

        System.out.println(regular.toString());
        System.out.println(premium.toString());
    }
}
