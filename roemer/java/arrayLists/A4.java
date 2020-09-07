import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A4{
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
            if (arrList.size() == 0) {
                arrList.add(inpBuffer);
            }else{
                arrList.add(inpBuffer);
                sort(arrList);
            }
        }
        inp.close();
        System.out.printf("Eingegebene Werte: %n%n");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        System.out.println("Programm Beendet!");
    }
    public static ArrayList<Double> sort(ArrayList<Double> arrList) {
        int sortCount = 0;
        endlessloop:
        while (true) {
            sortCount = 0;
            for (int i = 1; i < (arrList.size()); i++) {
                if (arrList.get(i -1) > arrList.get(i)) {
                    arrList.add(i+1, arrList.get(i -1));
                    arrList.remove(i-1);
                    sortCount++;
                    System.out.println(arrList);
                }else if (i == (arrList.size() -1) && sortCount == 0) {
                    break endlessloop;
                }else{
                    continue;
                }
            }
        }
        return arrList;
    }
}