import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A2{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double inpBuffer = 1.0;
        ArrayList<Double> arrList = new ArrayList<>();

        while (true) {
            System.out.printf("Eingabe Double: ");
            inpBuffer = inp.nextDouble();
            if (inpBuffer == 0) {
                break;
            }
            arrList.add(inpBuffer);
        }
        inp.close();
        System.out.printf("Eingegebene Werte: %n%n");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        System.out.printf("Eingegebene Werte(rückwärts): %n%n");
        for (int j = (arrList.size() -1); j >= 0; j--) {
            System.out.println(arrList.get(j));
        }

        System.out.printf("Eingegebene Werte(Sortiert): %n%n");
        Collections.sort(arrList);
        for (int y = 0; y < arrList.size(); y++) {
            System.out.println(arrList.get(y));
        }
        
        System.out.printf("Min-Wert: %.1f%n",Collections.min(arrList));
        System.out.printf("Max-Wert: %.1f%n",Collections.max(arrList));
        System.out.printf("Avg-Wert: %.1f%n",getAverage(arrList));

    }
    public static double getAverage(ArrayList<Double> arrList) {
        double avg = 0.0;
        for (int i = 0; i < arrList.size(); i++) {
            avg += arrList.get(i);
        }
        avg = avg / arrList.size();
        return avg;
    } 
}