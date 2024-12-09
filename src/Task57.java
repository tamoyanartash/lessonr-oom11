public class Task57 {

    public static void main(String[] args){
        int x = 528;
        int miavor = (x % 10);
        int tasnavor = (x / 10) % 10;
        int haryuravor = (x / 100);
        if(x > 300){
            System.out.println(tasnavor / miavor);
        }else {
            System.out.println(haryuravor/ tasnavor);
        }


    }
}
