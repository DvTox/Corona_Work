import java.util.Scanner;

public class Tachenrechner {
	
	public static void main(String[] args) {	
		
        Scanner inp = new Scanner(System.in); // Create a Scanner object
        int zahl1 = 0, zahl2 = 0, ergebniss = 0;
        char modus = '+';

        System.out.println("Hallo zu meinem Taschenrechner!");
        System.out.println("--------------------------------------------");
         
        System.out.printf("Bitte Geben sie Zahl1 ein: ");
        zahl1 = inp.nextInt();

        System.out.printf("Bitte Geben sie Zahl2 ein: ");
        zahl2 = inp.nextInt();

        System.out.println("--------------------------------------------");

        System.out.printf("Bitte den Rechen Operator eingeben(+ - * /): ");
        modus = inp.next().charAt(0);

        System.out.println("--------------------------------------------");

        if (modus == '+') {
            ergebniss = zahl1 + zahl2;
        }else{
            if (modus == '-') {
                ergebniss = zahl1 - zahl2;
            }else{
                if (modus == '*') {
                    ergebniss = zahl1 * zahl2;
                }else{
                    if (modus == '/') {
                        ergebniss = zahl1 / zahl2;
                    }
                }
            }
        }

        System.out.printf("Das Ergebniss lautet : %d%n",ergebniss);



		inp.close();

		
		
	}

}