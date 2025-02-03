package room;

public class Taask240 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 7 == 0) {
                sum++;
            }

        }
        System.out.println(sum);
    }
}
