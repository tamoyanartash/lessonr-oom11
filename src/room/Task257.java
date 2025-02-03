package room;

public class Task257 {
    public static void main(String[] args) {
        int[] numbers = {61, 14, 9, 32, 7, 25, 3};
        int n = 0;
        int max1 = numbers[0];
        int max2 = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            if (numbers[i] > max1){
                max1 = numbers[i];
                n = i;
            }  if (numbers[i] > max2){

                max2 = numbers[i];
                n = i;
            }
        }
        System.out.println(n);
    }
}
