
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class IDS50 {
    // Compliant Code
    File f = new File("fileName.txt");
    OutputStream out = new FileOutputStream(f);
}
