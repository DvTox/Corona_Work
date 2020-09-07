import java.util.ArrayList;
import java.util.Scanner;

public class A3{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double inpBuffer = 1.0;
        ArrayList<Double> arrList = new ArrayList<>();

        while (true) {
            System.out.printf("Eingabe Double: ");
            inpBuffer = inp.nextDouble();
            if (inpBuffer < 0) {
                break;
            }
            arrList.add(inpBuffer);
        }
        inp.close();
        System.out.printf("Eingegebene Werte: %n%n");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        System.out.println("Programm Beendet!");
    }
}