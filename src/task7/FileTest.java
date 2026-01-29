package task7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileTest {
    public static void main(String[] args) {
        String file = "out.txt";
        int count = 0;
        int sum = 0;
        try (BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream(file),StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank())
                    continue;

                int value;
                try {
                    value = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    continue;
                }
                if (value % 2 == 0) {
                    count++;
                    sum += value;
                }
            }
        } catch (IOException e) {
            System.out.println("Error work with file : " + e.getMessage());
        }
        System.out.println("Even numbers: " + count);
        System.out.println("Sum  of even numbers: " + sum);
    }
}

