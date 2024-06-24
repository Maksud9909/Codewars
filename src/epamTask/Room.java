package epamTask;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomID;
    private int roomNumber;
    private int capacity;
    private int availablePlaces;
    private List<Student> assignedStudents;



    public Room(int roomID, int roomNumber, int capacity, int availablePlaces) {
        this.roomID = roomID;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.availablePlaces = availablePlaces;
        this.assignedStudents = new ArrayList<>();
    }



    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailablePlaces() {
        return availablePlaces;
    }

    public void setAvailablePlaces(int availablePlaces) {
        this.availablePlaces = availablePlaces;
    }

    public List<Student> getAssignedStudents() {
        return assignedStudents;
    }

    public void addStudent(Student student) {
        if (availablePlaces > 0) {
            assignedStudents.add(student);
            availablePlaces--;
        } else {
            System.out.println("No available places in this room.");
        }
    }

    public void removeStudent(Student student) {
        if (assignedStudents.remove(student)) {
            availablePlaces++;
        }
    }
}
