package room;

public class Task5 {
    public static void main(String[] args) {
        double[] array = {52, 55, 41, 32, 123, 74, 256, 62, 100};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 24.12 && array[i] > 467.23) {
                System.out.println(i);
            }
        }
    }
}
