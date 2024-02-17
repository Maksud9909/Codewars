package CodeWars;



public class SolveRockOff {
    public static void main(String[] args) {
        System.out.println(solveRockOff(new int[]{1,23,2},new int[]{1,23,3}));
    }
    public static String solveRockOff(final int[] alice, final int[] bob){

        int resAlice = 0;
        int resBob = 0;



        for (int i = 0; i < alice.length; i++) {
            if (alice[i]>bob[i]){
                resAlice++;
            }else if (alice[i]<bob[i]){
                resBob++;
            }
        }


        if (resAlice > resBob){
            return resAlice + ", " + resBob + ": Alice made \"Kurt\" proud!";
        }else if (resBob > resAlice){
            return resAlice + ", " + resBob + ": Bob made \"Jeff\" proud!";
        }
        return resAlice + ", " + resBob + ": that looks like a \"draw\"! Rock on!";
    }
}
