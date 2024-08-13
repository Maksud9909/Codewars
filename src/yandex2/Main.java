package yandex2;

import java.util.Scanner;
//once upon a time, in a land far far away lived a princess , whose beauty was yet unmatched
// a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,yandex
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split("(?<=,)|(?=,)|\\s+");
        int maxWordLength = 0;
        for (String word : words) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }
        int maxLineLength = maxWordLength * 3;

        StringBuilder line = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (!word.equals(",")) {
                if (line.length() > 0 && !line.toString().endsWith(",")) {
                    if (line.length() + 1 + word.length() > maxLineLength) {
                        System.out.println(line);
                        line = new StringBuilder();
                    } else {
                        line.append(" ");
                    }
                }
                line.append(word);
            } else {
                line.append(word);
                if (i < words.length - 1 && line.length() + 1 <= maxLineLength) {
                    line.append(" ");
                }
            }

            if (i == words.length - 1 || line.length() + words[i+1].length() > maxLineLength) {
                System.out.println(line);
                line = new StringBuilder();
            }
        }
    }
}