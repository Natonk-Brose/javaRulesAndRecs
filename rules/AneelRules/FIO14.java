package rules.AneelRules;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIO14 {
    public void nameFile()
            throws IOException {
        File fileName = new File("fileName.txt");
        String str = "Test";

        BufferedWriter writtenFile = new BufferedWriter(new FileWriter(fileName));
        writtenFile.write(str);

        writtenFile.close();
        /**
         * Key line of code. Without this, there is a possibility the file is not
         * written to
         **/
        Runtime.getRuntime().exit(1);
    }
}
