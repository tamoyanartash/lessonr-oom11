package room;

public class Task53 {
    public static void main(String[] args) {
        int x = 759;
        int k = 357;
        double result = 0;
        int miavor = x % 10;
        int tasnavor = (x / 10) % 10;
        int haryuravor = (x / 100);
        if (x > k) {
            result =  x / (miavor + tasnavor + haryuravor);
        } else {
            result =  x / miavor / x;

        }
        System.out.println(result);

    }
}
