public class Task252 {
    public static void main(String[] args) {

        int [] array = {14, 85,-9, 46,-28, 78, 23,5};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);




    }
}
