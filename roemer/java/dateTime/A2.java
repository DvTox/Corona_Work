import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class A2{
    public static void main(String[] args){

        LocalDateTime Now = LocalDateTime.now();
        LocalDateTime Weinachten = LocalDateTime.of(Now.getYear(),12,24,Now.getHour(),Now.getMinute(),Now.getSecond(),Now.getNano());
        Year CurrentYear = Now.getYear();

        System.out.println(Now.toString());
        System.out.println(Weinachten.toString());

        if (Now.isEqual(Weinachten)) {
            if (CurrentYear.isLeap()) {
                System.out.println("Dieses Jahr ist ein Schalt Jahr");
            }
            System.out.printf("Heute ist der %1$tY-%1$tm-%1$td, es ist Weihnachten",Now);
        }else{
            if (Now.isBefore(Weinachten)) {
                Long daysTillWheinachten = Now.until(Weinachten, ChronoUnit.DAYS);
                System.out.printf("Heute ist der %1$tY-%1$tm-%1$td, in %2$d Tagen ist Weihnachten",Now,daysTillWheinachten);
            }else{
                System.out.printf("Heute ist der %1$tY-%1$tm-%1$td, dieses jahr war shon Weinachten",Now);
            }
        }

    }
}