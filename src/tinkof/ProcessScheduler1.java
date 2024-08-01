package tinkof;

import java.util.*;

public class ProcessScheduler1 {
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

        int[] level = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
                level[i] = 1;
            }
        }


        while (!queue.isEmpty()) {
            int process = queue.poll();
            for (int dependentProcess : graph[process]) {
                level[dependentProcess] = Math.max(level[dependentProcess], level[process] + 1);
                inDegree[dependentProcess]--;
                if (inDegree[dependentProcess] == 0) {
                    queue.add(dependentProcess);
                }
            }
        }


        int maxLevel = 0;
        for (int i = 1; i <= n; i++) {
            maxLevel = Math.max(maxLevel, level[i]);
        }


        List<List<Integer>> levels = new ArrayList<>();
        for (int i = 0; i <= maxLevel; i++) {
            levels.add(new ArrayList<>());
        }


        for (int i = 1; i <= n; i++) {
            levels.get(level[i]).add(i);
        }


        System.out.println(maxLevel);
        for (int i = 1; i <= maxLevel; i++) {
            List<Integer> levelProcesses = levels.get(i);
            Collections.sort(levelProcesses);
            System.out.print(levelProcesses.size() + " ");
            for (int process : levelProcesses) {
                System.out.print(process + " ");
            }
            System.out.println();
        }
    }
}
