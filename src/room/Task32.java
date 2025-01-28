package room;

public class Task32 {
    public static void main(String[] args) {
        int x = 57, y = 14, z = 11, d = 38;
        if (x < y && x < z && x < d){
            System.out.println(x);
        }  else if (y < x && y < z && y < d) {
            System.out.println(y);
        } else if (z < x && z < y && z < d){
            System.out.println(z);
        }else {
            System.out.println(d);
        }
    }
}
