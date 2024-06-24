package epamTask;

import java.util.List;
import java.util.ArrayList;

public class SearchAndFilter {

    private List<Student> students;
    private List<Room> rooms;

    public SearchAndFilter(List<Student> students, List<Room> rooms) {
        this.students = students;
        this.rooms = rooms;
    }

    public List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(name) || student.getLastName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }

    public Student searchStudentByID(int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null;
    }

    public List<Student> searchStudentByRoom(int roomNumber) {
        List<Student> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                result.addAll(room.getAssignedStudents());
            }
        }
        return result;
    }

    public List<Room> filterRoomByCapacity(int capacity) {
        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getCapacity() == capacity) {
                result.add(room);
            }
        }
        return result;
    }

    public List<Room> filterRoomByAvailability() {
        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getAvailablePlaces() > 0) {
                result.add(room);
            }
        }
        return result;
    }
}
