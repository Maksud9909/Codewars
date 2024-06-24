package epamTask;

public class AccommodationRequest {
    private int requestID;
    private int studentID;
    private Room preferredRoom;
    private String status;



    public AccommodationRequest(int requestID, int studentID, Room preferredRoom, String status) {
        this.requestID = requestID;
        this.studentID = studentID;
        this.preferredRoom = preferredRoom;
        this.status = status;
    }



    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Room getPreferredRoom() {
        return preferredRoom;
    }

    public void setPreferredRoom(Room preferredRoom) {
        this.preferredRoom = preferredRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void submitRequest() {
        approveRequest(); // aprove
    }

    public void approveRequest() {
        this.status = "approved";
    }

    public void rejectRequest() {
        this.status = "rejected";
    }
}
