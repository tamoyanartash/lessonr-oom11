public class Task53 {
    public static void main(String[] args) {
        int x = 415;
        int k = 541;
        double result = 0;
        int miavor = x % 10;
        int tasnavor = (x / 10) % 10;
        int haryuravor = (x / 100);
        if (x > k) {
            result = (double) x / (miavor + tasnavor + haryuravor);
        } else {
            result = (double) x / miavor / x;

        }
        System.out.println(result);


    }
}
