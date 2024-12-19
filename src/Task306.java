public class Task306 {
    public static void main(String[] args) {

        int count = 0;
        int k = 5;


        for (int i = 10; i < 100 ; i++) {
            int miavor = (i % 10);
            int tasnavor = (i / 10) % 10;
             if( miavor + tasnavor  > k){
                count++;
            }

        }
        int []array =  new int [count];

        for (int i = 10, j = 0; i < 100 ; i++) {
            int miavor = (i % 10);
            int tasnavor = (i / 10) % 10;
            if( miavor + tasnavor  > k) {
                j++;
            }
            }

        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
