import java.util.Scanner;
import java.lang.Character;


public class A8{
    public static void main(String[] args){
        String inpString = "",inpStringNoSpace;
        boolean palindromState = false;

        Scanner inp = new Scanner(System.in); // Create a Scanner object
        System.out.printf("String: ");
        inpString = inp.nextLine();
        inp.close();

        inpStringNoSpace = inpString.replaceAll("\\s+","");
        palindromState =  istPalindrom(inpStringNoSpace);

        if (palindromState) {
            System.out.printf("Der String: \"%s\"ist ein Palindrom",inpString);
        }else{
            System.out.printf("Der String: \"%s\" ist kein Palindrom",inpString);
        }
    }

    static boolean istPalindrom(String eingabe){
        char[] eingabeCharArray = eingabe.toCharArray();

        //System.out.printf("[Length:]{%d}%n",eingabeCharArray.length);
        for (int i = 0; i < eingabeCharArray.length; i++) {
            if (Character.toLowerCase(eingabeCharArray[i]) != Character.toLowerCase(eingabeCharArray[eingabeCharArray.length -(i +1)])) {
                //System.out.printf("[%d]{%s}|{%s}{Break}%n",i,eingabeCharArray[i],eingabeCharArray[eingabeCharArray.length - (i +1)]);
                return false;
            }else{
                //System.out.printf("[%d]{%s}|{%s}%n",i,eingabeCharArray[i],eingabeCharArray[eingabeCharArray.length -(i +1 )]);
                continue;
            }
        }
        return true;          
    }
}