import java.util.Arrays;
public class A9{
    public static void main(String[] args){

        int[] unsortedArr = {10,9,8,3,6,5,4,3,2,1};

        System.out.println("Before: " + Arrays.toString(unsortedArr));
        int[] sortedArr = sortieren(unsortedArr);
        System.out.println("After: " + Arrays.toString(sortedArr));
    }

    public static int[] sortieren(int[] arrayZumSotieren) {
        boolean sortiert = false;
        int plazHalter = 0;
        do {
            for (int i = 0; i < (arrayZumSotieren.length -1); i++) {
                if (i == (arrayZumSotieren.length -1) {
                    sortiert = true;
                }else if (arrayZumSotieren[i] > arrayZumSotieren[i +1])) {
                    plazHalter = arrayZumSotieren[i +1];
                    arrayZumSotieren[i+1] = arrayZumSotieren[i];
                    arrayZumSotieren[i] = plazHalter;
                    break;
                }else{
                    continue;
                }
            }
        } while (sortiert != true);
        return arrayZumSotieren;
    }

}