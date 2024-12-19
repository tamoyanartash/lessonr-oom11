public class Task305 {
    public static void main(String[] args) {


        int count = 0;

        for (int i = 1000; i < 10000 ; i++) {
            if(i % 3 ==0 && i % 5 == 0){
                count++;
            }

        }
        int[]array = new int[count];

        for (int i = 1000, j = 0; i < 10000 ; i++) {
            if(i % 3 ==0 && i % 5 == 0){
                array[j] = i;
                j++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }



    }
}
