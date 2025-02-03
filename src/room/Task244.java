package room;

public class Task244 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 2);
            count+= numbers[i];

        }
        System.out.println(count);
    }
}
