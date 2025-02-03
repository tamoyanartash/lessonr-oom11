package room;

public class Task241 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -9, 55, -23, 36};
        int sum= 0;
        int k = 11;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % k ==0){
                sum+= numbers[i];
            }

        }
        System.out.println(sum);
    }
}
