public class Task308 {
    public static void main(String[] args) {

        int count = 0;
        int k = 15;


        for (int i = 10; i < 100 ; i++) {
            if(i % k == 0){
                count++;
            }

        }
        int []array =  new int [count];

        for (int i = 10, j = 0; i < 100 ; i++) {

            if(i % k == 0) {
                j++;
            }
        }
        for (int i = 100; i < 1000 ; i++) {
            if(i % k == 0){
                count++;
            }

        }
        int [] result =  new int [count];

        for (int i = 100, j = 0; i < 1000 ; i++) {

            if(i % k == 0) {
                j++;
            }
        }


        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
