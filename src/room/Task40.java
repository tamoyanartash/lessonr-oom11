package room;

public class Task40 {
    public static void main(String[] args) {
        int x = 9, y = 66, z = 4, d = 3;
        int max;
        int middle1;
        int middle2;
        int min;

        if(x > y && x > z && x > d){
            max = x;
        } else if (y > x && y > z && y > d) {
            max = y;
        } else if (z > x && z > y && z > d){
            max = z;
        }else max = d;

        if(x < y && x < z && x < d){
            min = x;
        } else if (y < x && y < z && y < d) {
            min = y;
        } else if (z < x && z < y && z < d){
            min = z;
        }else min = d;

        if (x > min && x < max){
            middle1 = x;
        }else if (y > min && y < max){
            middle1 = y;
        } else if (z > min && z < max) {
            middle1 = z;
        } else {
            middle1 = d;
        }

        if (x > min && x < max && x != middle1) {
            middle2 = x;
        } else if (y > min && y < max && y != middle1) {
            middle2 = y;
        } else if (z > min && z < max && z != middle1) {
            middle2 = z;
        }else {
            middle2 = d;
        }
        if (middle1 > middle2){
            int temp = middle1;
            middle1 = middle2;
            middle2 = temp;
        }

        System.out.println(max);
        System.out.println(middle2);
        System.out.println(middle1);
        System.out.println(min);


    }
}
