package school.lesson7;

public class DiagonalArray {
    public static void main(String[] args) {
        int size = 5;
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }
    }
}
