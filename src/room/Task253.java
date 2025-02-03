package room;

public class Task253 {
    public static void main(String[] args) {
        int[] numbers = {61, 14, 9, 32, 7, 25, 3};

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(max + min);
    }

}

