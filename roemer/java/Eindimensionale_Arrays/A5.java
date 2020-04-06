import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class A5{

    public static int[] arr = new int[5];

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int Selection = 0;

        loop: while (true) {
            System.out.printf("(1) Array füllen%n(2) Array anzeigen%n(3) Array Sortieren%n(4) Minnimunm%n(5) Maximum%n(6) Mittlewert%n(7) Spannweite%n(8) Beenden%nEingabe: ");
            Selection = inp.nextInt();
            
        
            switch (Selection) {
                case 1:
                    arrayFuellen(arr);
                    break;
                case 2:
                    arrayAnzeigen(arr);
                    break;
                case 3:
                    arrSort(arr);
                    break;
                case 4:
                    arrayMin(arr);
                    break;
                case 5:
                    arrayMax(arr);
                    break;
                case 6:
                    arrayMitte(arr);
                    break;
                case 7:
                    arraySpannweite(arr);
                        break;
                case 8:
                    break loop;
            
                default:
                    break;
            }
            //cls();
        }
        inp.close();
    }

    public static void arrayFuellen(int[] arr){
        Random rnd = new Random();

        for(int i = 0;i < arr.length; i++){
            arr[i] = rnd.nextInt(1001);
        }
    }

    public static void arrayAnzeigen(int[] arr){
        for (int arrIndex = 0; arrIndex < arr.length; arrIndex++) {
            if (arrIndex % 5 == 0 && arrIndex != 0) {
                System.out.printf("%n");
            }
            System.out.printf("%4d ",arr[arrIndex]);
        }

        
        System.out.printf("%n");
    }
    
    public static void arrSort(int[] arr){
        Arrays.sort(arr);
    }

    public static int arrayMin(int[] arr){
        int min = arr[0];

        for ( int element : arr) {

            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public static int arrayMax(int[] arr){
        int max = arr[0];

        for ( int element : arr) {

            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public static double arrayMitte(int[] arr){
        double mitte = arr[0];
        
        for(int arrIndex = 1;arrIndex < arr.length; arrIndex++){
            mitte += arr[arrIndex];
        }

        mitte = mitte/arr.length;

        return mitte;
    }

    public static int arraySpannweite(int[] arr){
        return (arrayMax(arr) -  arrayMin(arr));
    }

    public static void cls(){
        for(int i = 0;i < 2000;i++){
            System.out.printf("%n");
        }
    }
}

    