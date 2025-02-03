package room;

public class Task228 {
    public static void main(String[] args) {
        int[] numbers = {14, -8, 26, 11, 40, -27};
        int k = 5;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k == 0) {
                sum += numbers[i];

            }
        }

        System.out.println(sum);

    }
}
