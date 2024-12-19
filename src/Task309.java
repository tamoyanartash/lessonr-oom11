public class Task309 {
    public static void main(String[] args) {


        int count = 0;

        for (int i = 10; i < 100 ; i++) {
            if(i % 2 !=0 && i % 3 != 0){
                count++;
            }

        }
        int[]array = new int[count];

        for (int i = 10, j = 0; i < 100 ; i++) {
            if(i % 2 !=0 && i % 3 != 0){
                array[j] = i;
                j++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }
}
