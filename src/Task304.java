public class Task304 {
    public static void main(String[] args) {

        int n = 9;
        int count = 0;

        for (int i = 10; i < 100 ; i++) {
            if(i % n ==2){
                count++;
            }

        }
        int[]array = new int[count];

        for (int i = 10, j = 0; i < 100 ; i++) {
            if(i % n ==2){
                array[j] = i;
                j++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }



}
