public class BusStand {
    // Instance variables
    private String name;
    private String location;
    private int busStops;
    private int seatingCapacity;
    private boolean hasRestroom;

   // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBusStops(int busStops) {
        this.busStops = busStops;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setHasRestroom(boolean hasRestroom) {
        this.hasRestroom = hasRestroom;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getBusStops() {
        return busStops;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public boolean hasRestroom() {
        return hasRestroom;
    }

    

    
}
