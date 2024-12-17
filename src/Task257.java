public class Task257 {
    public static void main(String[] args) {

        int[] array = {14, 85, -9, 46, -28, 78, 23, 5};

        int n = 0;
        int max1 = array[0];
        int max2 = array[0];

        for (int i = 1; i < array.length ; i++) {
          if (array[i] > max1){
              max1 = array[i];
              n = i;
          }  if (array[i] > max2){
              max2 = array[i];
              n = i;
            }
        }
        System.out.println(n);








    }
}
