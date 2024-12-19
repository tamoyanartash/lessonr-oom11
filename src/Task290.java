public class Task290 {
    public static void main(String[] args) {

        int[] array = {14, 85, -46, 28, 78, 23, 5};

        int count = 0;
        int p = 6;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % p == 1) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % p == 1){
                result[i] = array[i];
                i++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
    }}
