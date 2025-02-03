package room;

public class Task229 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int sum = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] - i > 0) {
                sum *= numbers[i];
            }

        }
        System.out.println(sum);
    }
}
