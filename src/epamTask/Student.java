package epamTask;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private String contactInfo;
    private Room assignedRoom;



    public Student(int studentID, String firstName, String lastName, String contactInfo, Room assignedRoom) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.assignedRoom = assignedRoom;
    }


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    public Room getAssignedRoom() {
        return assignedRoom;
    }

    public void setAssignedRoom(Room assignedRoom) {
        this.assignedRoom = assignedRoom;
    }
}
