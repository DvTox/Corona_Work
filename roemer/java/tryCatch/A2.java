import java.util.Scanner;

public class A2{
    public static void main(String[] args){
        try {
            int input = eingabe();
        } catch (Exception e) {
            System.out.println("Es ist ein fehle aufgetreten !");
            System.err.printf("Das ist der weitergeleitete Fehler ... %n ↪ %s",e);
        }
    }
    public static int eingabe() throws Exception{
        Scanner inp = new Scanner(System.in);
        int eingabe = inp.nextInt();
        inp.close();
        return eingabe;
    }
}
    