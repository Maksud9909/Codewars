package epamTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 101, 2, 2);
        Room room2 = new Room(2, 102, 3, 3);

        Student student1 = new Student(1, "Maksud", "Rustamov", "maksud@gmail.com", room1);
        Student student2 = new Student(2, "Anton", "Smirnov", "smirnov@gmail.com", room1);

        Administrator admin1 = new Administrator(1, "Admin", "Admin", "admin1@example.com");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        room1.addStudent(student1);
        room1.addStudent(student2);

        AccommodationRequest request1 = new AccommodationRequest(1, student1.getStudentID(), room2, "pending");

        SearchAndFilter searchAndFilter = new SearchAndFilter(students, rooms);


        List<Student> searchResults = searchAndFilter.searchStudentByName("John");
        System.out.println("Search results for name 'John': " + searchResults.size());

        Student searchResultByID = searchAndFilter.searchStudentByID(1);
        System.out.println("Search result for student ID 1: " + searchResultByID.getFirstName());

        List<Student> searchResultsByRoom = searchAndFilter.searchStudentByRoom(101);
        System.out.println("Search results for room 101: " + searchResultsByRoom.size());

        List<Room> filterResultsByCapacity = searchAndFilter.filterRoomByCapacity(2);
        System.out.println("Filter results for capacity 2: " + filterResultsByCapacity.size());

        List<Room> filterResultsByAvailability = searchAndFilter.filterRoomByAvailability();
        System.out.println("Filter results for availability: " + filterResultsByAvailability.size());

        // approved
        request1.approveRequest();
        System.out.println("Request status after approval: " + request1.getStatus());
    }
}
