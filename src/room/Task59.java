package room;

public class Task59 {
    public static void main(String[] args) {
        int x = 654;
        int miavor = (x % 10);
        int tasnavor = (x / 10) % 10;
        int haryuravor = (x / 100);
        if (miavor > tasnavor && tasnavor > haryuravor) {
            System.out.println(haryuravor + " " + tasnavor + miavor);
        } else if (miavor > haryuravor && haryuravor > tasnavor) {
            System.out.println(tasnavor + " " + haryuravor + " " + miavor);
        } else if (tasnavor > miavor && miavor > haryuravor) {
            System.out.println(haryuravor + " " + miavor + " " + tasnavor);
        } else if (tasnavor > haryuravor && haryuravor > miavor) {
            System.out.println(miavor + " " + haryuravor + " " + tasnavor);
        } else if (haryuravor > miavor && miavor > haryuravor) {
            System.out.println(haryuravor + " " + miavor + ' ' + haryuravor);
        } else {
            System.out.println(miavor + " " + tasnavor + " " + haryuravor);
        }
    }
}
