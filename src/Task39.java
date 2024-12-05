import java.util.logging.XMLFormatter;

public class Task39 {

     public static void main(String[] args) {

int x = 9, y = 66, z = 4, d = 3;
 int max;
 int midle;
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










     }




}
