package epamTask;
// админ это как комендант
public class Administrator {
    private int adminID;
    private String firstName;
    private String lastName;
    private String contactInfo;



    public Administrator(int adminID, String firstName, String lastName, String contactInfo) {
        this.adminID = adminID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
    }



    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
