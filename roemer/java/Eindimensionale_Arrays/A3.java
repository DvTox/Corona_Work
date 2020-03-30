import java.util.Scanner;

public class A3{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); // Create a Scanner object

        int[] intArr = new int[7];

        int[] guessArr = new int[7];

        int numbersHit = 0;
        System.out.println("Erster Durchgang! eingabe der 7 zahlen");
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("Zahl %d Eingeben: ",(i +1));
            intArr[i] = inp.nextInt();
        }
        System.out.println("zweiter Durchgang! eingabe der 7 zahlen");
        for (int j = 0; j < guessArr.length; j++) {
            System.out.printf("Zahl %d Eingeben: ",(j +1));
            guessArr[j] = inp.nextInt();
        }
        for (int x = 0; x < guessArr.length; x++) {
            if (guessArr[x] == intArr[x]) {
                numbersHit++;
            }
        }
        inp.close();

        System.out.printf("Anzahl der Übereinstimmungen: %d%n",numbersHit);
    }
}
    