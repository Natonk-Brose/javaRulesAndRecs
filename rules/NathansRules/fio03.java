package rules.NathansRules;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Demo program to show how to create a temporary file
 * and delete after 
 */
public class fio03 {
    public static void main(String[] args) {
        Path tempFile = null;
        try {
            tempFile = Files.createTempFile("tempfilename", ".tmp");
            try (BufferedWriter writer =
                Files.newBufferedWriter(tempFile, Charset.forName("UTF8"),
                    StandardOpenOption.DELETE_ON_CLOSE)) { 
                // open file, write to file, *close file* (deletes file bc of DELETE_ON_CLOSE)
            }
            System.out.println("Temporary file write done. The file has been erased");
        } catch (FileAlreadyExistsException x) {
            System.err.println("File already exists: " + tempFile);
        }
        catch (IOException x) {
            System.err.println("Temporary file could not be created: " + x);
        }
    }
}
