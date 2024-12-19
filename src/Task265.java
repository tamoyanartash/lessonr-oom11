public class Task265 {
    public static void main(String[] args) {

        int[] array = {14, 85, 46, 28, 78, 23, 5};
        int[] result = {6, 14, 8, 62, 29, 5, 45};

        int sum = 0;
        double zangvac = 1;
        for (int i = 0; i < array.length; i++) {
                sum += array[i];
        }
        for (int i = 0; i < result.length; i++) {
                zangvac *= result[i];

        }
        System.out.println(sum / zangvac);

    }
}