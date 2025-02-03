package room;

public class Task252 {
    public static void main(String[] args) {
        int [] numbers = {61, 14, 9, 32, 7, 25, 3};

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);

    }
}
