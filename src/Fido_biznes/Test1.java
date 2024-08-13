package Fido_biznes;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        getNames();
    }


    public static void getNames(){
        System.out.println("Возраст Шерзода?");
        Scanner scanner = new Scanner(System.in);
        int sherzod = scanner.nextInt();

        System.out.println("Возраст Сухроба?");
        Scanner scanner2 = new Scanner(System.in);
        int suxrob = scanner2.nextInt();

        System.out.println("Возраст Али?");
        Scanner scanner3 = new Scanner(System.in);
        int ali = scanner3.nextInt();

        System.out.println("Минимальный возраст " + suxrob);
        System.out.println("Средний возраст " + (sherzod + ali + ali) / 3);
        System.out.println("Максимальный возраст " + sherzod);
    }

}
