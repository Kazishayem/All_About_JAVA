// public class String_Process {
    
// }
import java.io.*;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
// import java.util.Scanner; // Import the Scanner class to read text files
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class String_Process {
  public static void main(String[] args) throws Exception {
    String[] arr = null;
    String a = "wewc-";
    List<String> list = new ArrayList<String>();

    try {
      // File myObj = new File("F:\\JAVA\\testing\\sample.txt");
      // Scanner myReader = new Scanner(myObj);
      // while (myReader.hasNextLine()) {
      // String data = myReader.nextLine();
      // System.out.println(data);
      // }
      // myReader.close();
      File myObj = new File("F:\\task_01\\sample.txt");
      BufferedReader myFile = new BufferedReader(new FileReader(myObj));
      String result;
      while ((result = myFile.readLine()) != null) {
        // System.out.println(result);
        result = result.trim();
        if ((result.length() != 0)) {
            // result.substring(2,6);
          list.add(result);
        }
      }
      arr = (String[])list.toArray(new String[list.size()]);
      // System.out.println(arr);
      for(int i = 0; i < arr.length ; i++){

        
        // String substring(1, 3)
        
        System.out.println(arr[i]);
      }

     
      // String[] arr=result.split(" ");
      // System.out.println(arr);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
