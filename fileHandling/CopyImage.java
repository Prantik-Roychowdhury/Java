package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage
{
    public static void main(String[] args) throws IOException
    {
        String destinationpath = "C:\\Users\\User\\Desktop\\Files\\Test\\Pictures.png";
        File destinationfile = new File(destinationpath);
        destinationfile.createNewFile();
        //Source Image
        String sourcePath = "C:\\Users\\User\\Desktop\\Files\\Test\\Picture.png";
        File sourceFile = new File(sourcePath);
        //Reading Data from Source Image
        FileInputStream fis = new FileInputStream(sourceFile);
        byte[]arr = new byte[(int)sourceFile.length()];
        fis.read(arr);

        FileOutputStream fos = new FileOutputStream(destinationfile);
        fos.write(arr);
        fos.close();
        fis.close();
    }
}