package weekNine;

public class PropertyListing {

    //attributes
    private String propertyType;
    private String location;

    // constructor
    public PropertyListing(String propertyType, String location) {
        this.propertyType = propertyType;
        this.location = location;
    }

    @Override
    public String toString(){
        return "Property Type: " + propertyType + "Location: " + location;
    }
}
