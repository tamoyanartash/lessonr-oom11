package room;

public class Task24 {
    public static void main(String[] args) {
        int x = 5, y = 14, z = 2;
        if ((x == 2 && y == 2) || (x == 2 && z == 2) || (y == 2 && z == 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
