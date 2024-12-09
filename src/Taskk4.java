public class Taskk4 {
    public static void main(String[] args) {
        int[][] array = {{3, 5, 8, 4}, {7, 2, 9, 3}, {1, 7, 7, 6}, {3, 7, 2, 9}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j)
                {

                    System.out.print(" ");
                } else {
                    System.out.print(array[i][j] + " ");

                }
            }
            System.out.println();


        }

    }

}
