import java.util.Scanner;
import java.util.Random;

public class A6{
    static Random rdm = new Random();
    public static void main(String[] args){
        

        int[] lottoZahlen = new int[6];
        int[] rateZahlen = new int[6];
        int treffer = 0;

        Scanner inp = new Scanner(System.in); // Create a Scanner object
       for (int i = 0; i < rateZahlen.length; i++) {
           System.out.printf("Bitte die %d Zahl eingeben: ",(i +1));
           rateZahlen[i] = inp.nextInt();
       }
        inp.close();

        System.out.printf("%nDie Getippten Zahlen: ");
        for (int rate : rateZahlen) {
            System.out.printf("%d ",rate);
        }
        System.out.printf("%n");

        System.out.printf("%nDie Lottozahlen: ");
        lottoZahlen = generateRandomNumbers(0, 49, lottoZahlen);
        for (int i = 0; i < lottoZahlen.length; i++) {
            System.out.printf("%d ",lottoZahlen[i]);
        }
        System.out.printf("%n");

        for (int guess = 0; guess < rateZahlen.length; guess++) {
            if (lottoZahlen[guess] == rateZahlen[guess]) {
              treffer++;  
            }
        }
        System.out.printf("Anzahl der Treffer : %d%n",treffer);
    }

    public static boolean checkForDupes(int[] arr) {
        
        for (int o = 0; o < arr.length; o++) {
            for (int y = 0; y < (arr.length -1); y++) {
                if(o == y){
                    continue;
                }else if (arr[o] == arr[y]) {
                   return false;
                }
            }
        }
        return true;
    }

    public static int[] generateRandomNumbers(int min, int max, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rdm.nextInt((max -min +1) -min);
        }
        if (checkForDupes(arr) == false) {
            generateRandomNumbers(min, max, arr);
        }
        return(arr);
    }
}    