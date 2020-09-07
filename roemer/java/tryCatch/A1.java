import java.util.Scanner;

public class A1{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); // Create a Scanner object
        try {
            int zahl1= inp.nextInt();
            int zahl2= inp.nextInt();
            System.out.printf("Zahl1: %d%nZahl2: %d%n",zahl1,zahl2);
        } catch (Exception e) {
            System.out.println("Es ist ein fehle aufgetreten !");
            System.err.printf("Das ist der weitergeleitete Fehler ... %n ↪ %s",e);
        }finally{
            inp.close();
        }
    }
}
    