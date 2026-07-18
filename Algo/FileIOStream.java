import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOStream {
    public static void main(String[] args) {
        // /* ===========>> Types of Streams <<========= */
        // 1 ---> Byte Streams : Works with raw Binary data (like images,audio,and PDF)
        // files
        // 2 ---> Character Streams : Work with text (Character and strings),These
        // streams automatically handle character encoding

        // /* ======>> Here is the basic implementation of FileInputStream
        // <<====== */
        // /* =======>> Read a Text File with( try-with-resources ) <<======= */
        // try (FileInputStream myInput = new FileInputStream("Example.txt")) { //
        // FileInputStream will be closed
        // // automatically
        // int i; // Variable to store each byte that is read
        // while ((i = myInput.read()) != -1) { // Read one byte at a time until end of
        // file (-1 means "no more data")
        // System.out.print((char) i); // Convert the byte to a character and print it
        // to the console
        // }
        // System.out.println();
        // } catch (IOException e) {
        // System.out.println("Error reading file.");// If an error happens (e.g. file
        // not found), print an error
        // // message
        // }

        // /* =======>> Copy a Binary File with ( try-with-resources ) <<======= */
        // try (FileInputStream myInput = new FileInputStream("image.jpg");
        // FileOutputStream myOutput = new FileOutputStream("copy.jpg")) {
        // int i;
        // while ((i = myInput.read()) != -1) {
        // myOutput.write(i);// Write the raw byte to the new file
        // }
        // System.out.println("File copied successfully . ");
        // } catch (IOException e) {
        // System.out.println("Error handling file .");
        // }

        // /* ======>> Here is the basic implementation of FileOutputStream
        // <<====== */
    }
}