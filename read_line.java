import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

public class read_line {

    public static void main(String a[]) throws Exception{
        // StringBuilder sb = new StringBuilder();
        String strLine = "";
        String arr;
        // List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\task_01\\sample.txt"));
            while (strLine != null) {
                strLine = br.readLine();

                if (strLine.startsWith("wewc-")) {
                    strLine.trim();
                    arr = strLine.replace("wewc-", "BP");
                    System.out.println(arr);
                }

            }

            // System.out.println(Arrays.toString(list.toArray()));

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
