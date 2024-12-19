public class Task310 {
    public static void main(String[] args) {

        int count = 0;



        for (int i = 100; i < 1000 ; i++) {
            int miavor = (i % 10);
            int tasnavor = (i / 10) % 10;
            if( miavor == tasnavor){
                count++;
            }

        }
        int []array =  new int [count];

        for (int i = 100, j = 0; i < 1000 ; i++) {
            int miavor = (i % 10);
            int tasnavor = (i / 10) % 10;
            if( miavor == tasnavor) {
                j++;
            }
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
