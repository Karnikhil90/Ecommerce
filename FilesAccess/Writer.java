/*
 * This files Reader.java and Writer.java I had alredy made in my last project.
 * My last project on java is library management system. So I just copy and pasted.
 * 
 * Since this is already made , I had in my mind that Im going to use again thats why 
 * I add overloading here and its important to maintain file size.
 * 
 * Its will important for memory when the size got big, I know its just a project for learning
 * and not going to use in real life but still!
 */

package FilesAccess;

import java.io.FileWriter;

public class Writer {
    public void writeAndDisplayFileInfo(String FileName, String DataToAddInFile) {
        try {
            FileWriter writter = new FileWriter(FileName, true);
            writter.write('\n' + DataToAddInFile + '\n');
            writter.close();
            System.out.println("Added The Content ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeAndDisplayFileInfo(String FileName, String DataToAddInFile, boolean append_) {
        try {
            FileWriter writter = new FileWriter(FileName, append_);
            writter.write('\n' + DataToAddInFile + '\n');
            writter.close();
            System.out.println("Added The Content ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}