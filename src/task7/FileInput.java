package task7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileInput {
    public static void main(String[] args) throws IOException  {

        File file = new File("out.txt");
        PrintWriter out = new PrintWriter(file);
        out.println("Hello");
        out.println("Sandu!");
        for (int i = 1; i <= 1000; i++) {
            out.println(i);
        }
        out.close();

        FileReader in = new FileReader(file);
        int temp;
        while ((temp = in.read()) != -1) {
            System.out.print((char) temp);
        }

        in.close();
    }
}

