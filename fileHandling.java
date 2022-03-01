import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;  

public class fileHandling {
    public static void main(String[] args) {
        
        try {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyy-hhmmss");  
            String formatDateTime = now.format(format);  
            File MyFile = new File("F:\\task_01\\sample.txt");

            // read a file
            File readMyFile = new File("F:\\task_01\\sample.txt");
            Scanner sc=new Scanner(readMyFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
           
            // write in a file
            FileWriter writeMyFile = new FileWriter("F:\\task_01\\sample.txt");
            writeMyFile.write("-");
            writeMyFile.close();
            System.out.println("Successfully wrote to the file.");

            
            }
            sc.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
