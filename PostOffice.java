public class PostOffice {
    // Instance variables
    private String name;
    private String location;
    private int postalWorkers;
    private int mailboxes;
    private boolean openOnSaturdays;

   // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPostalWorkers(int postalWorkers) {
        this.postalWorkers = postalWorkers;
    }

    public void setMailboxes(int mailboxes) {
        this.mailboxes = mailboxes;
    }

    public void setOpenOnSaturdays(boolean openOnSaturdays) {
        this.openOnSaturdays = openOnSaturdays;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getPostalWorkers() {
        return postalWorkers;
    }

    public int getMailboxes() {
        return mailboxes;
    }

    public boolean isOpenOnSaturdays() {
        return openOnSaturdays;
    }

    

   
}
