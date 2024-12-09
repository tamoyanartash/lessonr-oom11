public class Task211 {
    public static void main(String[] args){

       int[] array= {3, -7, 6, 4, 2, -11, 9, 5};
       int count = 0;
int sum = 0;;
for(int i = 0; i <  array.length; i++){
    if(array[i]>0){
        sum += array[i];
        count++;
    }
}
      System.out.println(sum/count);





    }
}


