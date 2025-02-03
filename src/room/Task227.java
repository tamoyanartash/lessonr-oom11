package room;

public class Task227 {
    public static void main(String[] args) {
        int[] numbers = {14, -8, 26, 11, 40, -27};
        int k = 4;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % k == 0){
                sum += numbers[i];
                count++;
            }
        }

        System.out.println(sum);
    }
}
