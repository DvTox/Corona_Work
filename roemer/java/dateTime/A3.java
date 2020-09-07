import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class A3{

    public static void checkAge(String Name ,LocalDate Geb){

        final LocalDate NOW = LocalDate.now();
        LocalDate GEBNow = LocalDate.of(NOW.getYear(), Geb.getMonth(), Geb.getDayOfMonth());

        if (NOW.isBefore(GEBNow)) {

            System.out.printf("%s ist an %s geboren%n",Name,Geb.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            System.out.printf("%s feiehrt in %s Tagen am  %s den nächsten Geburtstag%n",Name,NOW.until(GEBNow, ChronoUnit.DAYS),GEBNow.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        
        }else if (NOW.isAfter(GEBNow)) {
            GEBNow = GEBNow.plusYears(1);

                System.out.printf("%s ist an %s geboren%n",Name,Geb.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
                System.out.printf("%s feiehrt in %s Tagen am  %s den nächsten Geburtstag%n%n",Name,(NOW.until(GEBNow, ChronoUnit.DAYS)),GEBNow.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
    }

    public static void main(String[] args){

        String[] testNames = {"Peter","Katja","Raymond","Hugo"};
        LocalDate[] testDates = {
            LocalDate.of(1984, 03, 17), //Peter
            LocalDate.of(1998, 01, 20), //Katja
            LocalDate.of(1959, 07, 26), //Raymond
            LocalDate.of(1980, 02, 29) //Hugo
        };

        Scanner inp = new Scanner(System.in);

        // System.out.printf("Namen Eingeben: ");
        // String Name = inp.next();

        // System.out.println("Ihr Geburtsdatum Eingeben(Jahr)-(Monat)-(Tag):");
        // String birthDate = inp.next();

        // checkAge(Name,LocalDate.parse(birthDate));
        for (int i = 0; i < testNames.length; i++) {
            checkAge(testNames[i],testDates[i]);
        }

        inp.close();


    }
}