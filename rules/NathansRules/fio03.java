package rules.NathansRules;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class fio03 {
    public static void main(String[] args) {
        Path tempFile = null;
        try {
        tempFile = Files.createTempFile("tempnam", ".tmp");
        try (BufferedWriter writer =
            Files.newBufferedWriter(tempFile, Charset.forName("UTF8"),
                                    StandardOpenOption.DELETE_ON_CLOSE)) {
            // Write to file, delete the file when closed
        }
        System.out.println("Temporary file write done, file erased");
        } catch (FileAlreadyExistsException x) {
        System.err.println("File exists: " + tempFile);
        } catch (IOException x) {
        // Some other sort of failure, such as permissions.
        System.err.println("Error creating temporary file: " + x);
        }
    }
}
