public class Task285 {
    public static void main(String[] args) {

        int[] array = {14, 85, -46, 28, 78, 23, 5};

        int count = 0;
        int p = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % p == 0) {
                count++;
            }
        }
        int[] resalt = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % p == 0){
                resalt[i] = array[i];
                i++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(resalt[i] + " ");

        }
    }
}
