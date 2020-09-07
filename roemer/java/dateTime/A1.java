import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A1{
    public static void main(String[] args){
        
        System.out.printf("%n--------------------------------%n");
        System.out.printf("               Now              %n");
        System.out.printf("--------------------------------%n%n");

        LocalDateTime dateTimeNow = LocalDateTime.now();

        System.out.println(dateTimeNow.format(DateTimeFormatter.ofPattern("dd.mm.yyyy HH:mm:ss")));
        System.out.println(dateTimeNow.format(DateTimeFormatter.ofPattern("HH:mm:ss a")));
        System.out.println(dateTimeNow.format(DateTimeFormatter.ofPattern("dd.mm.yy")));
        System.out.println(dateTimeNow.format(DateTimeFormatter.ofPattern("E dd.mm")));
        System.out.printf("Heute Ist der: %1$td-%1$tm-%1$tY %n",dateTimeNow);
        System.out.printf("Heute Ist der %s. Tag des Jahres %n",dateTimeNow.getDayOfYear());

        System.out.printf("%n--------------------------------%n");
        System.out.printf("       05.01.2019 19:00:26      %n");
        System.out.printf("--------------------------------%n%n");

        LocalDateTime dateTime05012019 = LocalDateTime.of(2019,01,05, 19,00,26);

        System.out.println(dateTime05012019.format(DateTimeFormatter.ofPattern("dd.mm.yyyy HH:mm:ss")));
        System.out.println(dateTime05012019.format(DateTimeFormatter.ofPattern("HH:mm:ss a")));
        System.out.println(dateTime05012019.format(DateTimeFormatter.ofPattern("dd.mm.yy")));
        System.out.println(dateTime05012019.format(DateTimeFormatter.ofPattern("E dd.mm")));
        System.out.printf("Heute Ist der: %1$td-%1$tm-%1$tY %n",dateTime05012019);
        System.out.printf("Heute Ist der %s. Tag des Jahres %n",dateTime05012019.getDayOfYear());

    }
}