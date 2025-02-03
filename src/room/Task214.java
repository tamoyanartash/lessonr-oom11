package room;

public class Task214 {
    public static void main(String[] args) {
        int [] numbers  = {14, -8, 26 , 11, 40, -27};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0){
                sum+= numbers[i];
                count++;
            }

        }
        System.out.println(sum/count);
    }
}
