package room;

public class Task308 {
    public static void main(String[] args) {
        int count = 0;
        int k = 13;


        for (int i = 10; i < 1000 ; i++) {
            if(i % k == 0){
                count++;
            }

        }
        int []array =  new int [count];

        for (int i = 10, j = 0; i < 1000 ; i++) {
            if(i % k == 0) {
                array[j] = i;
                j++;
            }
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
