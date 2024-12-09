public class Task234 {
    public static void main(String[] args) {


        int[] array = {3, -7, 6, 4, 2, -11, 9, 5};

        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        System.out.println(sum / count);

    }
}