
// import java.io.*;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class crudtest {
  static String str2="";
  public static void main(String[] args) throws Exception {
    String[] arr = null;
    List<String> itemsSchool = new ArrayList<String>();

    try {

      // File task = new File("F:\\task_01\\sample.txt");
      BufferedReader myFile = new BufferedReader(new FileReader("F:\\task_01\\sample.txt"));
      String result;
      while ((result = myFile.readLine()) != null) {
        
        result = result.trim();
        if ((result.length() != 0)) {
          itemsSchool.add(result);
        }
      }
      arr = (String[]) itemsSchool.toArray(new String[itemsSchool.size()]);

      for (int i = 0; i < arr.length; i++) {

        boolean check1 = arr[i].startsWith("wewc-");
        boolean check2 = arr[i].endsWith("wewc-");
        if (check1 == true) {
          if (check2 == false) {
            str2 = str2 + arr[i].replace("wewc-", "BP")+ "\n";
            
          }
        }
      }
      System.out.println(str2);  
      File createMyFile = new File("F:\\task_01\\sam.txt");
      if (createMyFile.createNewFile()) {
        System.out.println("created file==> " + createMyFile.getName());
      } else {
        System.out.println("FileName already exists");
      }
      FileWriter writeMyFile = new FileWriter("F:\\task_01\\sam.txt");
      writeMyFile.write(str2);
      writeMyFile.close();
      System.out.println("Successfully wrote to the file.");
  
    } 
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}