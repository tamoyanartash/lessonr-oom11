public class Task301 {
    public static void main(String[] args) {

        int k = 13;
        int count = 0;

        for (int i = 10; i < 100 ; i++) {
            if(i % k ==0){
                count++;
            }

        }
int[]array = new int[count];

        for (int i = 10, j = 0; i < 100 ; i++) {
            if(i % k ==0){
                array[j] = i;
                j++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }

}