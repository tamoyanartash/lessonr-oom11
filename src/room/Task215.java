package room;

public class Task215 {
    public static void main(String[] args) {
        int [] numbers = {14, -8, 26 , 11, 40, -27};
        int sum = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2==0){
                sum+= numbers[i];
            }

        }
        System.out.println(sum);
    }
}
;