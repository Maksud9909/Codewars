package CodeWars;

public class Multiplies {
    public int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                result+=i;
            }else if (i % 3 == 0 && i % 5 == 0){
                result+=i;
            }else {
                result+=0;
            }
        }
        return result;
    }
}
