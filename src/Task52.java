public class Task52 {
    public static void main(String[] args){
     int x = 456;
     boolean b = false;
        int miavor = (x % 10);
     int tasnavor = (x / 10) % 10;
     int haryuravor = ( x / 100);
     if(miavor == tasnavor || miavor == haryuravor || tasnavor == haryuravor){
         b = true;

     } System.out.println(b);





    }
}
