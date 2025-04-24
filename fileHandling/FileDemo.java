package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo
{
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\demo";
        File file = new File(path);
        file.mkdirs();
        String renamepath = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\dark";
        file.renameTo(new File(renamepath));
        file = new File("C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\dark");
        File obj = new File("Demo");
        if(obj.createNewFile())
        {
            System.out.println("File Created: "+obj.getName());
        }
    }
}
