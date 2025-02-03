package room;

public class Task220 {
    public static void main(String[] args) {
        int[] numbers = {14, -8, 26, 11, 40, -27};
        int count = 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                count++;
            }
        }
    }
}