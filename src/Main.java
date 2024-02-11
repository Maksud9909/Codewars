import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number not exceeding 1,000,000: ");
        int n = scanner.nextInt();

        System.out.println("Collatz conjecture sequence for " + n + ":");
        generateCollatzSequence(n);

        scanner.close();
    }

    private static void generateCollatzSequence(int n) {
        System.out.print(n + " ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.print(n + " ");
        }
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the first name: ");
//        String firstName = scanner.nextLine();
//
//        System.out.print("Enter the years of experience: ");
//        String yearsOfExperience = scanner.nextLine();
//
//        System.out.print("Enter the cuisine preference: ");
//        String cuisinePreference = scanner.nextLine();
//
//        System.out.println("The form for " + firstName + " is completed. We will contact you if we need a chef who cooks " + cuisinePreference + " dishes and has " + yearsOfExperience + " years of experience.");
//
//        scanner.close();
//    }
}



