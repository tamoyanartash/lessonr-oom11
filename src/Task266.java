public class Task266 {
    public static void main(String[] args) {

        int[] array = {14, 85, 46, 28, 78, 23, 5};
        int[] resalt = {6, 14, 8, 62, 29, 5, 45};

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        double zangvac = 0;
        for (int i = 0; i < resalt.length; i++) {
            if (resalt[i] % 2 != 0) {
                zangvac += resalt[i];
            }
            System.out.println(sum - zangvac);
        }

    }
}