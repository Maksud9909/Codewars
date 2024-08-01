package tinkof;

import java.util.*;

public class ProcessScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }


        int[] inDegree = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            int numDependencies = scanner.nextInt();
            for (int j = 0; j < numDependencies; j++) {
                int dependency = scanner.nextInt();
                graph[dependency].add(i);
                inDegree[i]++;
            }
        }


        Queue<Integer> queue = new LinkedList<>();

        int[] timeToComplete = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
                timeToComplete[i] = 1;
            }
        }


        while (!queue.isEmpty()) {
            int process = queue.poll();
            for (int dependentProcess : graph[process]) {
                timeToComplete[dependentProcess] = Math.max(timeToComplete[dependentProcess], timeToComplete[process] + 1);
                inDegree[dependentProcess]--;
                if (inDegree[dependentProcess] == 0) {
                    queue.add(dependentProcess);
                }
            }
        }


        System.out.println(timeToComplete[1]);
    }
}
