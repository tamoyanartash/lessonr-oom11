public class Task227 {
    public static void main(String[] args) {


        int[] array = {3, -7, 6, 4, 2, -11, 9, 5};
        int k = 3;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % k == 0){
                sum += array[i];
                count++;
            }
        }

        System.out.println(sum);


    }
}
