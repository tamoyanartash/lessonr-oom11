package room;

public class Task236 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                sum *= numbers[i];
                count++;


            }
        }
        System.out.println(sum);
    }
}
