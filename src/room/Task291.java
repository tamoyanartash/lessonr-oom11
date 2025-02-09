package room;

public class Task291 {
    public static void main(String[] args) {
        int[] array = {5, -8, 11, -9, 27, 30, -7,};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }

        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
    }
}