/*  
 * just pass the file path in the parameter
 *
 * returns a sinle Dimension Array (which are just lines)
 * 
 * This files Reader.java and Writer.java I had alredy made in my last project.
 * My last project on java is library management system. So I just copy and pasted.
 * 
 */

package FilesAccess;

import java.io.File;
import java.util.Scanner;

public class Reader {
    public short readNumberOfLinesFileInfo(String FileName) {
        File myObj = new File(FileName);
        short numberOfLines = 0;
        short numberOfBlanks = 0;

        try {
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();

                // Check if the line is blank or contains only whitespaces
                if (line.trim().isEmpty()) {
                    numberOfBlanks++;
                }
                numberOfLines++;
            }

            myReader.close(); // Close the Scanner
        } catch (Exception e) {
            System.err.println("\t****Error Type: Some Problem To read it****");
        }
        // ?DEBUG: System.out.println(numberOfBlanks);
        return numberOfLines;
    }

    public String[] readAndDisplayFileInfo(String fileName) {
        File myObj = new File(fileName);

        short numberOfLines = readNumberOfLinesFileInfo(fileName);
        String[] fileContents = new String[numberOfLines]; // Storing The File Info..

        try {
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if (!line.isEmpty()) {
                    fileContents[i] = line; // Read and add non-empty lines
                    i++;
                }
            }
            myReader.close(); // Close the Scanner
        } catch (Exception e) {
            System.err.println("\t****Error Type: Some Problem To Saving In String[numberOfLines] ****");
            System.out.println(e.getMessage());
        }
        return fileContents;
    }
}