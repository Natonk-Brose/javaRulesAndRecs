package IT355.Rules;

import java.io.BufferedWriter;

public class FIO14
{
    //Compliant Code
    throws IOException {
        String str = "Test";
        
        BufferedWriter writtenFile = new BufferedWriter(new FileWriter(fileName));
        writtenFile.write(str);

        writtenFile.close(); //Key line of code. Without this, there is a possibility the file is not written to
        Runtime.getRuntime().exit(1);
    }
}
