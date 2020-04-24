import java.util.Scanner;
import java.util.Random;

public class A6{
    public static void main(String[] args){
        Random rdm = new Random();

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
        for (int i = 0; i < lottoZahlen.length; i++) {
            lottoZahlen[i] = (rdm.nextInt(49) + 1);
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
}
    