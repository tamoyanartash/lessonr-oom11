public class Task259 {
    public static void main(String[] args) {

        int[] array = {14, 85, -9, 46, -28, 78, 23, 5};

        int n = 0;
        int min1 = array[0];
        int min2 = array[0];

        for (int i = 1; i < array.length ; i++) {
            if (array[i] < min1){
                min1 = array[i];
                n = i;
            }  if (array[i] < min2){
                min2 = array[i];
                n = i;
            }
        }
        System.out.println(n);








    }
}
