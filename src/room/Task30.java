package room;

public class Task30 {
    public static void main(String[] args) {
        int x = 5, y = 14, z = 2;
        if (x < y && x < z) {
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        } else if (y < x && y < z) {
            System.out.println(y);
            System.out.println(x);
            System.out.println(z);

        } else {
            System.out.println(z);
            System.out.println(x);
            System.out.println(y);

        }
    }
}
