package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dell\\Desktop\\FileHandling\\Data\\batman\\demo.txt";

        File file = new File(path);
        // FileOutputStream fos = new FileOutputStream(file, true);
        String message = "Do try it!!";
        byte[] arr = message.getBytes();
        // fos.write(arr);

        FileWriter fw = new FileWriter(file, true);

        for (int i = 0; i < message.length(); i++) {
            fw.write(message.charAt(i));
        }

        fw.flush();
        fw.close();
    }
}