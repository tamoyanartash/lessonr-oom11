public class Task53 {
    public static void main(String[] args)  {
        int x = 789;
        int k = 144;
    double result = 0;
    int miavor = (x % 10);
    int tasnavor = (x / 10) % 10;
        int haryuravor = (x / 100);
        if(x > k) {
            result = (double) x / (miavor + tasnavor + haryuravor);

        } else {
            result = (double) miavor / x;
        } System.out.println(result);




    }
}
