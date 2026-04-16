package fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample
{
    public static void main(String[] args)
    {
        // Specify the path and filename
        String directoryPath = "C:\\Users\\User\\Desktop\\Files\\Test";
        String fileName = "example.txt";

        // Create a File object for the directory
        File directory = new File(directoryPath);
        if (!directory.exists())
        {
            directory.mkdirs(); // Create directories if they don't exist
        }

        // Create the file
        File file = new File(directoryPath + "/" + fileName);
        try
        {
            if (file.createNewFile())
            {
                System.out.println("File created: " + file.getAbsolutePath());

                // Optionally write to the file
                FileWriter writer = new FileWriter(file);
                writer.write("Hello, this is a test file.");
                writer.close();
                System.out.println("Successfully wrote to the file.");
            }
            else
            {
                System.out.println("File already exists at: " + file.getAbsolutePath());
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String InputPath = "C:\\Users\\User\\Desktop\\Files\\Test\\Picture.png";
    }
}