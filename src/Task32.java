public class Task32 {public static void main(String[] args){

    int x = 4, y = 14, z = 8, f = 63;
    if (x < y && x < z && x < f){
        System.out.println(x);
    }  else if (y < x && y < z && y < f) {
        System.out.println(y);

    } else if (z < x && z < y && z < f){
        System.out.println(z);
    }else {
        System.out.println(f);
    }




}
}
