import java.util.Arrays;
public class A9{
    public static void main(String[] args){

        int[] unsortedArr = {10,9,8,7,6,5,4,3,2,1};

        System.out.println("Before: " + Arrays.toString(unsortedArr));
        int[] sortedArr = sortieren(unsortedArr);
        System.out.println("After: " + Arrays.toString(sortedArr));
    }

    public static int[] sortieren(int[] arrayZumSotieren) {
        boolean sortiert = false;
        int plazHalter = 0;
        int counter = 0;
        while(sortiert == false){
            for (int i = 0; i < (arrayZumSotieren.length -1); i++) {
                counter = 0;
                if (arrayZumSotieren[i] > arrayZumSotieren[i +1]) {
                    plazHalter = arrayZumSotieren[i +1];
                    arrayZumSotieren[i+1] = arrayZumSotieren[i];
                    arrayZumSotieren[i] = plazHalter;
                    counter++;
                    break;
                }else if (counter == 0 && i >= arrayZumSotieren.length -2) {
                    sortiert = true;
                }
            }
        }
        return arrayZumSotieren;
    }

}