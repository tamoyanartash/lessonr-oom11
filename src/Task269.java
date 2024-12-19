public class Task269 {
    public static void main(String[] args) {

        int[] array = {14, 85, 46, 28, 78, 23, 5};
        int[] resalt = {6, 14, 8, 62, 29, 5, 45};

        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        int zangvac = 0;
        for (int i = 1; i < resalt.length; i += 2) {
            zangvac += resalt[i];
        }
        System.out.println(sum + zangvac);
    }
}
