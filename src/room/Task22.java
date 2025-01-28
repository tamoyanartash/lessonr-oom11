package room;

public class Task22 {
    public static void main(String[] args) {
        int x = 5, y = 14, z = 2;
        if (x < y && x < z)
        {
            System.out.println(x);
        }
        else if (y < x && y < z){
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
