public class Task56 {
    public static void main(String[] args){

        int x = 528;
        int miavor = (x % 10);
        int tasnavor = (x / 10) % 10;
        int haryuravor = ( x / 100);
        if(miavor > tasnavor){
            System.out.println((miavor + tasnavor + haryuravor) / x);
        }
else {
    System.out.println(x);
        }

    }
}
