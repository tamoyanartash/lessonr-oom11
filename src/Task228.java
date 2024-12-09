public class Task228 {
    public static void main(String[] args) {


        int[] array = {3, -7, 6, 4, 2, -11, 9, 5};
        int k = 5;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];

            }
        }

        System.out.println(sum);

    }
}