package CodeWars;

public class kata {
    public static int findMaxDistance(int speed, int duration) {
        int maxDistance = 0;
        int currentSpeed = speed;

        for (int i = 0; i < duration; i++) {
            int distance = currentSpeed;
            if (i % 2 == 1) {
                // Sprint phase
                distance *= 2;
                currentSpeed -= 1;  // Reduce speed after sprint
            }
            maxDistance += distance;
        }

        return maxDistance;
    }

    public static void main(String[] args) {
        int baseSpeed = 2;
        int duration = 4;

        int maxDistance = findMaxDistance(baseSpeed, duration);
        System.out.println("Maximum possible distance: " + maxDistance);
    }
}
