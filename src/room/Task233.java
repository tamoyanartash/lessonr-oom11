package room;

public class Task233 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int sum = 0;
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                count *= numbers[i];
            }

        }
        System.out.println(sum);
        System.out.println(count);
    }
}
