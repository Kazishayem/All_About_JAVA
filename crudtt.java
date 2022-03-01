import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class crudtt {
  // private static final String createTableSQL1 = "create table bpusername(name varchar(30));\n";
  // private static final String INSERT_USERS_SQL = "INSERT INTO usersinfo" +
  //     "  ( name) VALUES " + " (?);";

  public static void main(String[] args) throws Exception, SQLException {
    String[] arr = null;
    List<String> itemsSchool = new ArrayList<String>();
    String arr2 = "";
    // crudtt createTableExample = new crudtt();
    // // createTableExample.createTable();
    // crudtt insertTableExample = new crudtt();
    // // insertTableExample.insertRecord();

    try {
      File myObj = new File("F:\\task_01\\sample.txt");
      BufferedReader myFile = new BufferedReader(new FileReader(myObj));
      String result;
      while ((result = myFile.readLine()) != null) {
        // System.out.println(result);
        result = result.trim();
        if ((result.length() != 0)) {
          itemsSchool.add(result);
        }
      }
      arr = (String[]) itemsSchool.toArray(new String[itemsSchool.size()]);
      for (int i = 0; i < arr.length; i++) {
        boolean check1 = arr[i].startsWith("wewc-");
        boolean check2 = arr[i].endsWith("wewc- ");
        if (check1 == true) {
          if (check2 == false) {
            arr2 = arr2 + arr[i].replace("wewc-", "BP");
            System.out.println(arr2);
          }
        }
      }
      // File createMyFile = new File("F:\\JAVA\\testing\\s222.txt");
      // if (createMyFile.createNewFile()) {
      //   System.out.println("created file==> " + createMyFile.getName());
      // } else {
      //   System.out.println("FileName already exists");
      // }
      // FileWriter writeMyFile = new FileWriter("F:\\JAVA\\testing\\s222.txt");
      // writeMyFile.write(arr2);
      // writeMyFile.close();
      // System.out.println("Successfully wrote to the file.");

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}

  //-----------
//   public void createTable() throws SQLException {
//     System.out.println(createTableSQL1);
//     // Step 1: Establishing a Connection
//     try (Connection connection = DriverManager
//         .getConnection("jdbc:mysql://127.0.0.1:3306/databasebpuser?useSSL=false", "root", "12345");
//         // Step 2:Create a statement using connection object
//         Statement statement = connection.createStatement();) {
//       // Step 3: Execute the query or update query
//       statement.execute(createTableSQL1);
//     } catch (SQLException e) {
//       printSQLException(e);
//     }
//   }
//   public static void printSQLException(SQLException ex) {
//     for (Throwable e : ex) {
//       if (e instanceof SQLException) {
//         e.printStackTrace(System.err);
//         System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//         System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//         System.err.println("Message: " + e.getMessage());
//         Throwable t = ex.getCause();
//         while (t != null) {
//           System.out.println("Cause: " + t);
//           t = t.getCause();
//         }
//       }
//     }
//   }

// //-------------
// public void insertRecord() throws SQLException {
//   System.out.println(INSERT_USERS_SQL);
//   // Step 1: Establishing a Connection
//   try (Connection connection = DriverManager
//       .getConnection("jdbc:mysql://127.0.0.1:3306/databasebpuser?useSSL=false", "root", "12345");

//       // Step 2:Create a statement using connection object
//       PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
//       preparedStatement.setString(1, arr2);

//       System.out.println(preparedStatement);
//       // Step 3: Execute the query or update query
//       preparedStatement.executeUpdate();
//   } catch (SQLException e) {
//       // print SQL exception information
//       printSQLException(e);
//   }
// }




// }