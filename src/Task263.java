public class Task263 {
    public static void main(String[] args) {

        int[] array = {14, 85, 46, 28, 78, 23, 5};
        int[] result = {6, 14, 8, -62, 29, 5, 45};

        int count = 0;
        int zangvac = 0;
        for (int x : array) {
            if (x > 0) {
                count++;
            }
        }
        for (int x : result) {
            if (x > 0) {
                zangvac++;
            }
        }

        System.out.println(count + zangvac);

    }
}