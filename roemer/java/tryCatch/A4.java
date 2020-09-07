import java.util.*;
import java.util.concurrent.ExecutionException;

public class A4{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in); // Create a Scanner object
        try {
            System.out.printf("Eingabe: ");
            int zahl1= inp.nextInt();
            System.out.printf("Eingabe: ");
            int zahl2= inp.nextInt();

            if (zahl2 == 0) {
                throw new Devisionbyzero();
            }
            
            int ergebniss = division(zahl1, zahl2);

            System.out.printf("%d / %d = %d",zahl1,zahl2,ergebniss);
        } catch ( InputMismatchException inputErr) {
            System.out.println("Es ist ein fehle aufgetreten !");
            System.err.printf("Falsher input type %nFull Error: %s",inputErr);
        }catch(Devisionbyzero  e){
            System.err.printf("Es ist ein fehle aufgetreten !%n%s",e.getMessage());
        }catch(ArithmeticException unmoeglicheRechnung){
            System.out.println("Es ist ein fehle aufgetreten !");
            System.err.printf("Diese Rechnung ist nicht moeglich %nFull Error: %s",unmoeglicheRechnung);
        }catch(Exception e){
            System.err.printf("Ein Unbekanter Fehler ist aufgetreten%nFull Error: %s",e);
        }finally{
            inp.close();
        }


    }
    public static int division(int a,int b) throws ArithmeticException{
        return a/b;        
    }
}
    