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

public class read_another {
    private static final String createTableSQL = "create table task(Details_BP varchar(200));\n";
    private static final String InsertValueSQL = "INSERT INTO task" +
            "  ( Details_BP ) VALUES " + " (?);";
    static String str2 = "";

    public static void main(String[] args) throws Exception {
        String[] arr = null;
        List<String> items = new ArrayList<String>();
        read_another createTableExample = new read_another();
        createTableExample.createTable();
        read_another insertTable = new read_another();
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
                        str2 = str2 + arr[i].replace("wewc-", "BP") + "\n";

                    }
                }
            }
            System.out.println(str2);
            File createMyFile = new File("F:\\task_01\\sam2.txt");
            if (createMyFile.createNewFile()) {
                System.out.println("created file==> " + createMyFile.getName());
            } else {
                System.out.println("FileName already exists");
            }
            FileWriter writeMyFile = new FileWriter("F:\\task_01\\sam2.txt");
            writeMyFile.write(str2);
            writeMyFile.close();
            System.out.println("Successfully wrote to the file.");

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // -----database

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

    // -----insert
    public void insertRecord() throws SQLException {
        System.out.println(InsertValueSQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/task_01?useSSL=false", "root", "1260");

                PreparedStatement preparedStatement = connection.prepareStatement(InsertValueSQL)) {
            preparedStatement.setString(1, str2);

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
}