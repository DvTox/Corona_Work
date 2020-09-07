import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
public class A5{
    public static void main(String[] args){

        ArrayList<String> s1 = new ArrayList<>(Arrays.asList("Mohnblumen","Adler","Pferde","Hunde","Eulen","Rosen"));
        ArrayList<String> s2 = new ArrayList<>(Arrays.asList("blühen","sehen","laufen","bellen","jagen","riechen"));
        ArrayList<String> s3 = new ArrayList<>(Arrays.asList("rot","weit","schnell","laut","nachts","gut"));

        Random gen = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.printf("%s %s %s %n",s1.get(gen.nextInt(5)),s2.get(gen.nextInt(5)),s3.get(gen.nextInt(5)));
        }
    }
}
    