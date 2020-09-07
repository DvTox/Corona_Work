import java.util.ArrayList;
import java.util.Scanner;
public class A6{
    public static void main(String[] args){
        ArrayList<String> Fragen = new ArrayList<>();
        ArrayList<String> Antworten = new ArrayList<>();
        ArrayList<Integer> WinningNumbers = new ArrayList<>();

        Fragen.add("Frage 1: Thomas Mann schrieb welchen Roman?");
        Antworten.add("Die Pest"); // 0
        Antworten.add("Der Zauberberg");//1
        WinningNumbers.add(2);
        Antworten.add("Der Untertan");//2
        //---------------------------------------------------
        Fragen.add("Frage 2: Napoleon wurde endgültig besiegt in der Schlacht von?");
        Antworten.add("Waterloo");//3
        WinningNumbers.add(1);
        Antworten.add("Marengo");//4
        Antworten.add("Austerlitz");//5
        //---------------------------------------------------
        Fragen.add("Frage 3: Der Schall pflanzt sich in der Luft mit welcher Geschwindigkeit fort?");
        Antworten.add("33 km/h");//6
        Antworten.add("330 m/s");//7
        WinningNumbers.add(2);
        Antworten.add("3300 m/s");//8
        //---------------------------------------------------
        Fragen.add("Frage 4: Welche Erfindung machte Thomas Alva Edison nicht?");
        Antworten.add("Die Glühlampe");//9
        Antworten.add("Den Phonograph");//10
        Antworten.add("Die Enigma");//11
        WinningNumbers.add(3);
        //---------------------------------------------------
        Fragen.add("Frage 5: Welcher Architekt nannte sich Le Corbusier?");
        Antworten.add("Charles-Édouard Jeanneret-Gris");//12
        WinningNumbers.add(1);
        Antworten.add("Frank Wright");//13
        Antworten.add("Mies van der Rohe");//14

        Scanner inp = new Scanner(System.in);
        
        int antwortbuffer = 0;
        int counter = 0;
        int Richtig = 0;
        int Falsch = 0;

        for (int i = 0; i <= (Fragen.size() -1); i++) {
            System.out.println(Fragen.get(i));
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d. %s %n",(j +1),Antworten.get(j + counter));
            }
            System.out.printf("Antwort: ");
            antwortbuffer = inp.nextInt();

            if (antwortbuffer == WinningNumbers.get(i)) {
               Richtig++; 
            }else{
                Falsch++;
            }
            System.out.printf("%n%n");
        }
        System.out.println("|------------Statistic------------|");
        System.out.printf("Richtig: %d%nFalsch: %d%n",Richtig,Falsch);

        inp.close();
    }
}
 
    