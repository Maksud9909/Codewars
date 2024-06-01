package Codewars2;

public class GetTime {
    public static String getTime(String neededPower, int minutes, int seconds, String power){
        int neededPowerValue = Integer.parseInt(neededPower.replace("W", ""));
        int actualPowerValue = Integer.parseInt(power.replace("W", ""));

        int totalGivenSeconds = minutes * 60 + seconds;

        double powerRatio = (double) neededPowerValue / actualPowerValue;
        int adjustedTotalSeconds = (int) Math.round(totalGivenSeconds * powerRatio) + 1;

        // Convert adjusted total seconds back to minutes and seconds
        int adjustedMinutes = adjustedTotalSeconds / 60;
        int adjustedSeconds = adjustedTotalSeconds % 60;

        return adjustedMinutes  + " minutes " + adjustedSeconds + " seconds";
    }
}
