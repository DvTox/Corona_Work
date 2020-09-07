package chapter.c22.aufgaben;
public class Aufgabe5 {
    public static void main(String[] args) {
        String[] satz = new String[6];
            
                satz[0] = "Mein";
                satz[1] = "Hut";
                satz[3] = "hat";
                satz[5] = "Ecken";
                for (String w : satz) {
                    try {
                        System.out.printf("%s (%d)%n", w, w.length());
                    }catch (NullPointerException e) {
                        System.err.println("...");
                }
            
            }
    }
}