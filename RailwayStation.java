public class RailwayStation {
    // Instance variables
    private String name;
    private String location;
    private int platforms;
    private int passengerCapacity;
    private boolean hasParking;

   // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPlatforms(int platforms) {
        this.platforms = platforms;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPlatforms() {
        return platforms;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public boolean hasParking() {
        return hasParking;
    }

    

}