import java.io.File;
import java.util.*;
import java.text.*;

public class file_create {
    public static void main(String[] args) throws Exception {
        try {
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("dd.yy.mm..hhss");
            String dTime = ft.format(dNow);
            File txt = new File("F:\\JAVA\\shayem: " + dTime + ".txt");

            if (txt.createNewFile()) {
                System.out.println("File created: " + txt.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
