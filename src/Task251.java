public class Task251 {
    public static void main(String[] args) {

        int [] array = {14, 85,-9, 46,-28, 78, 23,5};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);




    }
 }