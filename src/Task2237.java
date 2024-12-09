public class Task2237 {
    public static void main(String[] args) {


        int[] array = {3, -7, 6, 4, 2, -11, 9, 5};


        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {

                count++;
            }
        }

        System.out.println(count);

    }
}