package room;

public class Task293 {
    public static void main(String[] args) {
        int[] array = {14, 85, -46, 28, 78, 23, 5};
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > 1 && array[i] < 40) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > 1 && array[i] < 40) {
                result[i] = array[i];
                j++;

            }
        }
        for (int i = 0; i < result.length ; i++) {
            System.out.println(result[i]+" ");

        }
    }
}
