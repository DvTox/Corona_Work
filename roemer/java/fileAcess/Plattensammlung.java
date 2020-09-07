import java.io.File;
import java.io.IOException;

public class Plattensammlung{
    public static void main(String[] args){
        String basePath = "/home/coding/Documents/Workspace/Corona_Work/roemer/java/fileAcess";

        File dir = new File(basePath);
        File Album1 = new File(basePath + "/Album1.txt");
        File Album2 = new File(basePath + "/Album2.txt");
        File Album3 = new File(basePath + "/Album3.txt");
        if (!dir.exists()) {
            System.out.println("Der Angegebene Ordner Exestier noch nicht.");
            System.out.println("Erstellen...");
            dir.mkdir();
        }try{
            if (Album1.exists()) {
                System.out.println("Album1 Exsestiert bereitz Erstellung wird Übersprungen...");
            }else{
                System.out.println("Album1.txt Wird Estellt...");
                Album1.createNewFile();
            }
            if (Album2.exists()) {
                System.out.println("Album2 Exsestiert bereitz Erstellung wird Übersprungen...");
            }else{
                System.out.println("Album1.txt Wird Estellt...");
                Album2.createNewFile();
            }
            if (Album3.exists()) {
                System.out.println("Album3 Exsestiert bereitz Erstellung wird Übersprungen...");
            }else{
                System.out.println("Album1.txt Wird Estellt...");
                Album3.createNewFile();
            }

            System.out.println("Album1 Name::"+Album1.getName());
            System.out.println("Size::"+Album1.length()+" Bytes");
            if (Album1.canRead() && Album1.canWrite()) {
                System.out.println("Album1 Hat Lese & Schreibrechte.");
            }else{
                System.out.println("Album1 Hat keine Lese & Schreibrechte!");
            }

            System.out.println("Album2 Name::"+Album2.getName());
            System.out.println("Size::"+Album2.length()+" Bytes");
            if (Album2.canRead() && Album2.canWrite()) {
                System.out.println("Album2 Hat Lese & Schreibrechte.");
            }else{
                System.out.println("Album2 Hat keine Lese & Schreibrechte!");
            }

            System.out.println("Album3 Name::"+Album3.getName());
            System.out.println("Size::"+Album3.length()+" Bytes");
            if (Album3.canRead() && Album3.canWrite()) {
                System.out.println("Album3 Hat Lese & Schreibrechte.");
            }else{
                System.out.println("Album3 Hat keine Lese & Schreibrechte!");
            }
   
            } catch (IOException e) {
                System.out.println("Die Datei Exestier bereits bitte Löchen sie die Datei und Führen sie das program erneut aus!");
            }

    }
}