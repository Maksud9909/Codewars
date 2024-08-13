package yandexSolved;

import java.io.*;
import java.util.*;
public class NonIntersectingSegments {
    static class Segment implements Comparable<Segment> {
        int start, end;
        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Segment other) {
            if (this.start != other.start) {
                return Integer.compare(this.start, other.start);
            } else {
                return Integer.compare(this.end, other.end);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Segment[] segments = new Segment[n];
        boolean[] removed = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            segments[i] = new Segment(a, b);
        }

        Arrays.sort(segments);

        int count = 0;

        for (int i = 0; i < segments.length; i++) {
            if (removed[i]) {
                continue;
            }
            boolean kesishgan = false;
            for (int j = i + 1; j < segments.length; j++) {
                if (segments[j].start >= segments[i].start && segments[j].end <= segments[i].end) {
                    kesishgan = true;
                    removed[j] = true;
                }
            }
            if (!kesishgan) {
                count++;
            }
        }

        System.out.println(count);
    }
}