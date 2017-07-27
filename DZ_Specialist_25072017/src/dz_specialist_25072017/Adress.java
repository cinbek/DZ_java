package dz_specialist_25072017;

public class Adress{

    private String streetName;
    private int houseNumber;
    //
    public Adress (String stNa, int hoNa){
        streetName = stNa;
        houseNumber = hoNa;
    }
    //
    public String getStreetName() {
        return streetName;
    }
    //
    public int getHouseNumber() {
        return houseNumber;
    }
    //
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    //
    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
