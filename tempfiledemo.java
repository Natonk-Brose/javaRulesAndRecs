import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TempFileDemo {

    public static void main(String[] args) {
        try {

            File tempFile = File.createTempFile("tempfile", ".tmp");

            // DCL50-J: Use visually distinct identifiers 
            List<String> fileContent = new ArrayList<String>();
            Scanner scan = new Scanner(System.in);
            CharBuffer input;

            // get input from the user to put into the temp file
            System.out.println("Enter strings; enter empty string to end");
            while (true) {
                input = wrap(scan.nextLine());
                if (input.toString().equals(""))
                    break;
                else
                    fileContent.add(input.toString());
            }
            scan.close();

            // write to the temporary file
            try (BufferedWriter writer = Files.newBufferedWriter(tempFile.toPath())) {
                for (String s : fileContent) {
                    writer.write(s);
                    writer.write(System.lineSeparator()); // new line
                }
            }

            System.out.println("Temporary file contents: ");

            // read from the temporary file
            FileInputStream fin = new FileInputStream(tempFile.getPath());    
            int data;
            // FIO08-J. Distinguish between characters or bytes read from a stream and -1
            while ((data = fin.read()) != -1) {  // do not cast here
                System.out.print((char)data);    // cast here
            }
            fin.close();

            Files.delete(tempFile.toPath()); // FIO03-J. Remove temporary files before termination
            System.out.println("Temporary file deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    /**
     * Wraps a string into a CharBuffer
     * @param str string to wrap
     * @return a CharBuffer containing str
     */
    public static CharBuffer wrap(String str) {
        //FIO05-J. Do not expose buffers or their backing arrays methods to untrusted code
        return CharBuffer.wrap(str).asReadOnlyBuffer(); 
    }
}

