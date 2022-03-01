import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class file_BP {

    public static void main(String a[]) throws Exception {
        String strLine = "";
        String BP;
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\task_01\\sample.txt"));
            while (strLine != null) {
                strLine = br.readLine();

                if (strLine.startsWith("wewc-")) {
                    strLine.trim();
                    BP = strLine.replace("wewc-", "BP");
                    if (BP.length() >= 3) {
                        System.out.println(BP);

                    }

                }
                

            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
