package room;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[20];

        int i = 0;
        for (i = -19; i < 20; i++) {
            if (i % 2 != 0) {
                array[i] = i;
                i++;
            }


        }
    }
}
