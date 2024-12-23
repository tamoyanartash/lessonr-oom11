public class Task306 {
    public static void main(String[] args) {

        int count = 0;


        for (int i = 10; i < 100 ; i++) {
            int k = i;
            int miavor = k % 10;
            int tasnavor = (k / 10) % 10;
             if( miavor + tasnavor  > 5){
                count++;
            }

        }
        int []array =  new int [count];

        for (int i = 10, j = 0; i < 100 ; i++) {
            int k = i;
            int miavor = k % 10;
            int tasnavor = (k / 10) % 10;
            if( miavor + tasnavor  > 5) {
                array[j] = i;
                j++;
            }
            }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
