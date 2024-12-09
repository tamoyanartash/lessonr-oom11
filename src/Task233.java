public class Task233 {
    public static void main(String[] args) {


        int[] array = {3, -7, 6, 4, 2, -11, 9, 5};

        int sum = 0;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count *= array[i];

            }
        }

        System.out.println(sum);
        System.out.println(count);
    }
}