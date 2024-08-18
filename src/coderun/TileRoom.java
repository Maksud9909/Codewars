package coderun;

import java.io.*;

public class TileRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        int B = Integer.parseInt(input[0]); // 8
        int W = Integer.parseInt(input[1]); // 1

        for (int n = 1; n * n <= B + W; n++){
            if ((B + W) % n == 0){
                int m = (B + W) / n;
                if (n >= m && 2 * (n + m) - 4 == B) {
                    writer.write(n + " " + m);
                    writer.newLine();
                    break;
                }
            }
        }

        reader.close();
        writer.close();
    }
}
