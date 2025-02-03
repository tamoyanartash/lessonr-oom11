package room;

public class Task51 {
    public static void main(String[] args) {
        int t = 759;
        boolean b = false;
        if(t % 10 == (t / 10) % 10 + t / 100){
            b = true;

        }System.out.println(b);
    }
}
