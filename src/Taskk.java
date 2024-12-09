public class Taskk {
    public static void main(String[] args) {

        int[] array = {56, 852, 741, 63, 54};
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int reversElemnt = 0;
            while (element != 0) {
                reversElemnt = reversElemnt * 10 + element % 10;
                element = element / 10;  // 0}
                System.out.println(result);

            }
result[i] = reversElemnt;
        }
        for(int i =0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}