package room;

public class Task4{
    public static void main(String[] args) {
        int [] array = {4, 5 , 12, 15, 17, 45, 20, 450, 63};
        for (int i = 0; i < array.length; i++){
            if(array[i] % 5 == 0){
                System.out.println(array[i]);
            }
        }
    }

}
