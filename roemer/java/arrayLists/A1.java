import java.util.ArrayList;
import java.util.Scanner;

public class A1{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String inpBuffer = "";
        ArrayList<String> stringList = new ArrayList<>();

        while (true) {
            System.out.printf("Eingabe Wort: ");
            inpBuffer = inp.next();
            if (inpBuffer.matches("0")) {
                break;
            }
            stringList.add(inpBuffer);
        }
        inp.close();
        for (String word : stringList) {
            System.out.printf("%s ",word);
        }
        System.out.printf("%n");
        System.out.println("Programm Beendet!");
    }
}