package codingBat.recursion1;

public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.triangle(4)); // 10
    }
    public int triangle(int rows) { // 4
        if (rows == 0){
            return 0;
        }
        return rows + triangle(rows - 1);
    }

}
