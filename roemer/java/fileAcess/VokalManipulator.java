import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class VokalManipulator{
    public static void main(String[] args){
        char vowelChoice = 'a';
            //File relativTextSample = new File("textSample.txt");
            //File textSample = new File(relativTextSample.getAbsolutePath());
            File textSample = new File("/home/coding/Documents/Workspace/Corona_Work/roemer/java/fileAcess/textSample.txt");
            System.out.println(textSample.getAbsolutePath());
            System.out.println(textSample.exists());
            if (textSample.isFile()) {
                if (textSample.canRead() && textSample.canWrite()) {
                    System.out.println("can rw");
                    try {
                        //FileReader textSampleReader = new FileReader(textSample);
                        FileWriter textSampleWriter = new FileWriter(textSample);
                        //BufferedReader textSampleBufferedReader = new BufferedReader(new FileReader(textSample));
                        Scanner textSampleScanner = new Scanner(textSample);
                        String line = "";
                        String finalText = "";

                        while (textSampleScanner.hasNextLine()){
                            System.out.println("not null");
                            line = textSampleScanner.nextLine();
                            System.out.println(line);
                            finalText.concat(substituteVowels(line, vowelChoice) + "\n");
                            System.out.println(finalText);
                        }
        
                        // while ((line = textSampleBufferedReader.readLine()) != null) {
                        //     System.out.println("in while");
                        //     System.out.println(line);
                        //     line = substituteVowels(line, vowelChoice);
                        //     line.concat("\n");
                        //     finalText += line;
                        // }
                        textSampleWriter.write(finalText);
                        //,0,finalText.length()
                        //textSampleBufferedReader.close();
                        textSampleScanner.close();
                        textSampleWriter.close();
                        //textSampleReader.close();
                    } catch (IOException e) {
                        System.out.println("Es gab ein problem beim lesen/oder shreiben der datei bitte Überprüfen sie das die datei Lese und Schreibrechte hat und versuchen sie es nochmal");
                    }
                }else{
                    System.out.println("Der Datei vehle lese oder schreibrechte das Program wird beendet!!!");
                }
            }else{
                System.out.println("not a File");
            }

    }
    public static String substituteVowels(String targeString,char targetVowel ) {
        char vowels[] = {'a','e','i','u'};

        System.out.println(vowels.toString());


        for (int i = 0; i < vowels.length; i++) {
            targeString.replace(vowels[i],targetVowel);
        }
 
        return targeString;
    }
}
        