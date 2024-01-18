package CodeWars;

public class TimeConverter {
    public static String toTime(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;



        return hours + " hour(s) and " +minutes+ " minute(s)";
    }
}
