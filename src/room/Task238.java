package room;

public class Task238 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 ==0){
                sum+= i;
                count++;
            }

        }
        System.out.println(sum/count);
    }
}
