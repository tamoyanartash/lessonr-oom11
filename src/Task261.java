public class Task261 {
    public static void main(String[] args) {

        int[] array = {14, 85, 46, 28, 78, 23, 5};
        int[] resalt = {6, 14, 8, 62, 29, 5, 45};

        double sum = 0;
        for (int i: array) {
            sum += i;
        }
        double zangvac = 0;
        for (int x: resalt) {
            zangvac += x;
        }
        System.out.println((sum / array.length) * (zangvac / resalt.length));


    }
}
