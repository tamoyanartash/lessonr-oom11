package room;

public class Task57 {
    public static void main(String[] args) {
        int x = 654;
        int miavor = (x % 10);
        int tasnavor = (x / 10) % 10;
        int haryuravor = (x / 100);
        if (miavor > tasnavor) {
            System.out.println((miavor + tasnavor + haryuravor) / x);
        } else {
            System.out.println(x);
        }
    }
}
