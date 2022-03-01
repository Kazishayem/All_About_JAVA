import java.io.*;
import java.io.File;
import java.util.Scanner;
public class fileRead_Write {

    public static void main(String[] args) throws Exception {
        try {
            File txt = new File("F:\\task_01\\sample.txt");

            int []numbers = {1,2,3,4,5};

            for(int i;i<numbers.length;i++){
                txt.println =(numbers[i]);

            }
txt.close();
    //         BufferedReader myFile = new BufferedReader(new FileReader(txt));

    //         String result;
    //         while ((result = myFile.readLine()) != null)
    //             System.out.println(result);

    //         BufferedWriter myFileWrite = new BufferedWriter(new FileWriter(txt));
    //         FileInputStream fis = new FileInputStream(result);
    // DataInputStream in = new DataInputStream(fis);
    //         BufferedReader brr = new BufferedReader(new InputStreamReader(in));

            // // FileWriter myWriter = new FileWriter("F:\\task_01\\sample.txt");
            // // myFileWriter.write("this is" + result);
            // // myWriter.close();
            // myFileWrite.write(result);;
            // myFileWrite.flush();
            // myFileWrite.close();

            // // String line;
            // while ((myFileWrite != null))
            // System.out.println(myFileWrite);
            // System.out.println("Successfully");
            // String line;
            // while ((line = brr.readLine()) != null) {
            //     System.out.println(line);
            //         if (line.startsWith("word")) {
            //             // replace line code here
            //         }
            // }
        } 
        catch (Exception e) {
            System.out.println("Error");
        }

    }
}
