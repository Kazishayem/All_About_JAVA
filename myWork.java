// public class myWork {
    
// }
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class myWork {
    private static final String createTableSQL = "create table task(Details_BP varchar(200));\n";
    private static final String InsertValueSQL = "INSERT INTO task" +
            "  ( Details_BP ) VALUES " + " (?);";
  
    static String myData = "";

    public static void main(String[] args) throws Exception {
        String[] arr = null;
        List<String> items = new ArrayList<String>();
        myWork createTableExample = new myWork();
        createTableExample.createTable();
        myWork insertTable = new myWork();
        insertTable.insertRecord();

        try {

            // File task = new File("F:\\task_01\\sample.txt");
            BufferedReader myFile = new BufferedReader(new FileReader("F:\\task_01\\sample.txt"));
            String result;
            while ((result = myFile.readLine()) != null) {

                result = result.trim();
                if ((result.length() != 0)) {
                    items.add(result);
                }
            }
            arr = (String[]) items.toArray(new String[items.size()]);

            for (int i = 0; i < arr.length; i++) {

                boolean check1 = arr[i].startsWith("wewc-");
                boolean check2 = arr[i].endsWith("wewc-");
                if (check1 == true) {
                    if (check2 == false) {
                        myData = myData + arr[i].replace("wewc-", "BP") + "\n";

                    }
                }
            }
            System.out.println(myData);
            ///file create code..........................................................................
            File createMyFile = new File("F:\\task_01\\sam2.txt");
            if (createMyFile.createNewFile()) {
                System.out.println("created file==> " + createMyFile.getName());
            } else {
                System.out.println("FileName already exists");
            }

            ///write code.................................................................................
            String filePath = "F:\\task_01\\sam2.txt";
            FileWriter writeMyFile = new FileWriter(filePath);
            // InputStream inputStream = new FileInputStream(new File(filePath));
            writeMyFile.write(myData);
            writeMyFile.close();
            
            System.out.println("Successfully wrote.");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // private Blob inputStream;

    // -----database.........................................................................................

    public void createTable() throws SQLException {
        System.out.println(createTableSQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/task_01?useSSL=false", "root", "1260");
  
                Statement statement = connection.createStatement();) {

            statement.execute(createTableSQL);
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    // -----insert..................................................................................//
    public void insertRecord() throws SQLException {
        System.out.println(InsertValueSQL);
        // Step 1: Establishing a Connection
        try (Connection connection2 = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/task_01?useSSL=false", "root", "1260");

                PreparedStatement preparedStatement2 = connection2.prepareStatement(InsertValueSQL)) {
                    
            // preparedStatement2.setBlob(1, inputStream);
            preparedStatement2.setString(1, myData);

            System.out.println(preparedStatement2);
            preparedStatement2.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
}
