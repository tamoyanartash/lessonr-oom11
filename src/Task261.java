public class Task261 {
    public static void main(String[] args) {

        int[] array = {14, 85,  46, 28, 78, 23, 5};
        int[] resalt = {6, 14 , 8, 62 , 29, 5, 45};

        double count = 0;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            if (array[i] != 0) ;
            {
                sum += array[i];
                count++;
            }
        }
        double tar = 0;
        double zangvac = 0;
        for (int i = 0; i < array.length; i++) {
           if (resalt[i] != 0){
               zangvac += resalt[i];
               tar++;
           }
        }
             System.out.println((sum / count) * (zangvac / tar));








    }
}
