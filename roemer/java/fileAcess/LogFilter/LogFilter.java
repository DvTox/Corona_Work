//Java.IO
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
//DateTime
import java.time.LocalDateTime;
//Exeptions
import java.io.IOException;
import java.io.FileNotFoundException;

/*
Project_Name
NAME
DATE
*/

public class LogFilter{
    public static void main(String[] args){

        File applicationLog = new File("application.log");
        File devLog = new File("devops.log");
        File managmentLog = new File("managment.txt");


        if (applicationLog.exists()) {
            if (applicationLog.canRead() && applicationLog.canWrite()) {
                //Try-With-Resource closes Resource automagicly
                try (FileReader applicationLogReader = new FileReader(applicationLog);
                        BufferedReader applicationLogBufferedReader = new BufferedReader(applicationLogReader);
                        FileWriter devopsLogWriter = new FileWriter(devLog);
                        BufferedWriter bufferedDevopsWriter = new BufferedWriter(devopsLogWriter);
                        FileWriter managmentLogWriter = new FileWriter(managmentLog);
                        BufferedWriter bufferedManagmentLogWriter = new BufferedWriter(managmentLogWriter);){

                    String line;
                    while ((line = applicationLogBufferedReader.readLine()) != null) {
                        splitLogLine(line, bufferedDevopsWriter, bufferedManagmentLogWriter);
                    }
                } catch (IOException e) {
                    System.err.println("Error Reading File IOExeption .: " + e);
                }
            }else{
                System.err.println("File Cant Be Read or Writen To Exiting ...");
            }
        }else{
            try {
                throw new FileNotFoundException("Cant Find File: " + applicationLog);
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        }

    }
    public static String makeDateReadebale(String line) {
        //Split String wit 4 spaces as delimiter
        String[] splitLine = line.split("    ");
        //reset line and Create string buffer
        line = null;StringBuffer sb = new StringBuffer();
        //get time from string
        LocalDateTime logDate = LocalDateTime.parse(splitLine[0]);
        //set the first collum of the log to the day of the week
        splitLine[0] = logDate.getDayOfWeek().toString();
        //skip the log level
        for (int i = 0; i < splitLine.length; i++) {
            if (splitLine[i].toLowerCase().equals("info") ) {
                continue;
            }
            //append the collum to the strin buffer
            sb.append(splitLine[i]);
            if (i != (splitLine.length -1)) {
                //add the sdelimiter back in
                sb.append("    ");
            }
        }
        //build line
        line = sb.toString();
    return line;

        



    }

//     public static void splitLogLine(String line, File devopsLog, File managmentLog) {
//         if (line.contains("WARNING") || line.contains("ERROR")) {
//             try(FileWriter devopsLogWriter = new FileWriter(devopsLog);
//                     BufferedWriter bufferedDevopsWriter = new BufferedWriter(devopsLogWriter);){
//                 bufferedDevopsWriter.write(line);
//                 bufferedDevopsWriter.newLine();
//             } catch (IOException e) {
//                 System.err.println("Error writing to file .: " + e);
//             }
//         }else if (line.contains("Kunde registriert")) {
//             try (FileWriter managmentLogWriter = new FileWriter(managmentLog);
//                     BufferedWriter bufferedManagmentLogWriter = new BufferedWriter(managmentLogWriter);) {
//                 bufferedManagmentLogWriter.write(makeDateReadebale(line));
//                 bufferedManagmentLogWriter.newLine();
//             } catch (IOException e) {
//                 System.err.println("Error writing to file .: " + e);
//             }
//         }
//     }
// }

public static void splitLogLine(String line,BufferedWriter devopsWriter,BufferedWriter managementWriter) {
    if (line.contains("WARNING") || line.contains("ERROR")) {
        try {
            devopsWriter.write(line);
            devopsWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to file .: " + e);
        }
    }else if (line.contains("Kunde registriert")) {
        try {
        managementWriter.write(makeDateReadebale(line));
        managementWriter.newLine();
        } catch (IOException e) {
            System.err.println("Error writing to file .: " + e);
        }
    }
}
}