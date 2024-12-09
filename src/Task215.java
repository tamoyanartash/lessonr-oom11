public class Task215 {
    public static void main(String[] args) {


        int[] array = {3, -7, 6, 4, 2, -11, 9, 5};
        int sum = 1;
        for (int i = 0; i < array.length; i++){
            if(i % 2 == 0){
                sum += array[i];
            }
        }

        System.out.println(sum);


    }
}
