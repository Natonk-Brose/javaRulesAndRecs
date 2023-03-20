
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IDS50 {

    public void nameFile()
            throws IOException {
        /**
         * The name of this file is very simple and only
         * contains the subset of ASCII.
         * It is recommended that the file name does not
         * lead with dashes or contatin control charcter
         */
        File fileName = new File("fileName.txt");
        String str = "Hello";
        FileOutputStream outputStream = new FileOutputStream(fileName);
        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
    }
}
