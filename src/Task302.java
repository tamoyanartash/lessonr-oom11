public class Task302 {
    public static void main(String[] args) {


        int count = 0;

        for (int i = 100; i < 1000 ; i++) {
            if(i % 5 ==2){
                count++;
            }

        }
        int[]array = new int[count];

        for (int i = 100, j = 0; i < 1000 ; i++) {
            if(i % 5 ==2){
                array[j] = i;
                j++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



    }

}
