package Codewars2;

import java.util.Arrays;

public class OwnedCatDog {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(ownedCatAndDog(56,64)));
    }
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int dog = 0;
        int cat = 0;
        for (int i = 0; i <= dogYears; i++) {

            if (i==15){
                dog++;
            }
            if (i==24){
                dog++;
            }
            if (i>=29){
                dog++;
                i+=4;
            }
        }

        for (int i = 0; i <=catYears; i++) {

            if (i==15){
                cat++;
            }
            if (i==24){
                cat++;
            }
            if (i>=28){
                cat++;
                i+=3;
            }
        }
        return new int[]{cat, dog};
    }
}
