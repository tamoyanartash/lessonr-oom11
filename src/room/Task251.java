package room;

public class Task251 {
    public static void main(String[] args) {
        int [] numbers = {61, 14, 9, 32, 7, 25, 3};

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
