// import java.io.FileReader;// Import the FileReader class to read character data from a text file.
// import java.io.FileWriter;// Import the FileWriter class to write character data into a text file.
// import java.io.IOException;// Import the IOException class to handle input/output related errors.
// // Note: This import is duplicate and is not required because it has already been imported above.
// import java.io.BufferedWriter;// Import the BufferedWriter class to write text efficiently by buffering the output.
// import java.io.BufferedReader;// Import the BufferedReader class to read text efficiently by buffering the input.
// import java.io.FileInputStream;// Import the FileInputStream class to read raw binary data (bytes) from a file.
// import java.io.FileOutputStream;// Import the FileOutputStream class to write raw binary data (bytes) into a file.

public class FileIOStream {
    public static void main(String[] args) {
        // /* ===========>> Types of Streams <<========= */
        // 1 ==> Byte Streams : Work with raw binary data such as images, audio files,
        // videos, and PDF files.
        // 2 ==> Character Streams : Work with text data (characters and strings). These
        // streams automatically handle character encoding and decoding.

        // /* ======>> Here is the Basic Implementation of FileInputStream <<====== */
        // /* =======>> Read a Text File with (try-with-resources) <<======= */
        // try (FileInputStream myInput = new FileInputStream("Example.txt")) { //
        // Create a FileInputStream object to read data from "Example.txt". It will be
        // closed automatically after the try block.
        // // FileInputStream will be closed automatically because try-with-resources
        // manages it.
        // int i; // Create a variable to store one byte at a time from the file.
        // while ((i = myInput.read()) != -1) { // Read one byte from the file. Continue
        // until read() returns -1, which means the end of the file.
        // System.out.print((char) i); // Convert the byte into a character and print it
        // on the console.
        // }
        // System.out.println(); // Move the cursor to the next line after reading the
        // entire file.
        // } catch (IOException e) { // Catch any input/output exception that occurs
        // while reading the file.
        // System.out.println("Error reading file."); // Print an error message if the
        // file cannot be read.
        // // This error may occur if the file does not exist or another input/output
        // problem happens.
        // }

        // /* =======>> Copy a Binary File with (try-with-resources) <<======= */
        // try (FileInputStream myInput = new FileInputStream("image.jpg"); // Open the source file for reading.
        // FileOutputStream myOutput = new FileOutputStream("copy.jpg")) { // Create the destination file for writing.
        // int i; // Create a variable to store one byte at a time.
        // while ((i = myInput.read()) != -1) { // Read each byte from the source file until the end of the file.
        // myOutput.write(i); // Write the same byte into the destination file.
        // }
        // System.out.println("File copied successfully."); // Print a success message after copying the file.
        // } catch (IOException e) { // Catch any input/output exception that occurs during file copying.
        // System.out.println("Error handling file."); // Print an error message if copying fails.
        // }

        // /* ======>> Here is the Basic Implementation of FileOutputStream <<====== */
        // /* ======>> Write a Text File with (try-with-resources) <<======== */
        // String text = "This is example file"; // Create a string that will be written into the file.
        // try (FileOutputStream myOutput = new FileOutputStream("Example.txt")) { // Create a FileOutputStream object to write data into "Example.txt". It will be closed automatically.
        // myOutput.write(text.getBytes()); // Convert the string into bytes because FileOutputStream writes only byte data.
        // System.out.println("Successfully wrote to file."); // Print a success message after writing the data.
        // } catch (IOException e) { // Catch any input/output exception that occurs while writing to the file.
        // System.out.println("Error writing file."); // Print an error message if writing fails.
        // e.printStackTrace(); // Print the complete exception details for debugging.
        // }

        // /* =======>> Copy a Binary File <<========= */
        // try (FileInputStream myInput = new FileInputStream("image.jpg"); // Open the source binary file for reading. It will be closed automatically.
        // FileOutputStream myOutput = new FileOutputStream("copy.jpg")) { // Create the destination binary file for writing. It will also be closed automatically.
        // int b; // Create a variable to store one byte at a time.
        // while ((b = myInput.read()) != -1) { // Read one byte from the source file until the end of the file is reached (-1).
        // myOutput.write(b); // Write the current byte into the destination file.
        // }
        // System.out.println("File copied successfully."); // Print a success message after the file is copied.
        // } catch (IOException e) { // Catch any input/output exception that occurs during file copying.
        // System.out.println("Error handling file."); // Print an error message if copying fails.
        // }

        // /* =======>> Append to a File <<========= */
        // String text = " \n Appended Text"; // Create a string that will be added to the end of the file.
        // try (FileOutputStream myOutput = new FileOutputStream("Example.txt", true)) { // Open the file in append mode by passing true as the second argument.
        // // true = append mode (keeps the existing content and adds new data at the end instead of replacing it).
        // myOutput.write(text.getBytes()); // Convert the string into bytes and append it to the file.
        // System.out.println("Successfully appended to file."); // Print a success message after appending the data.
        // } catch (IOException e) { // Catch any input/output exception that occurs while writing to the file.
        // System.out.println("Error writing file."); // Print an error message if appending fails.
        // e.printStackTrace(); // Print complete exception details for debugging.
        // }

        // /* =======>> Here is the Basic Implementation of BufferedReader <<========= */
        // try (BufferedReader br = new BufferedReader(new FileReader("Example.txt"))) { // Create a BufferedReader object to read the file efficiently, and a FileReader object to read characters from the file.
        // String line; // Create a variable to store one line of text at a time.
        // while ((line = br.readLine()) != null) { // Read one line from the file. Continue until readLine() returns null, which means the end of the file.
        // System.out.println(line); // Print the current line on the console.
        // }
        // } catch (IOException e) { // Catch any input/output exception that occurs while reading the file.
        // System.out.println("Error reading file."); // Print an error message if the file cannot be read.
        // }

        // /* =======>> Here is the Basic Implementation of BufferedWriter */
        // /* ======>> Write to a Text File with (try-with-resources) <<======== */
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt"))) { // Create a BufferedWriter object to write text efficiently into the file. It will be closed automatically.
        // bw.write("First line"); // Write the text "First line" into the file.
        // bw.newLine(); // Insert a new line (line break) so the next text starts on a new line.
        // bw.write("Second line"); // Write the text "Second line" on the next line.
        // System.out.println("Successfully wrote to the file."); // Print a success message after writing is completed.
        // } catch (IOException e) { // Catch any input/output exception that occurs while writing to the file.
        // System.out.println("Error writing file."); // Print an error message if writing fails.
        // }

        // /* ======>> Append to a Text File with (try-with-resources) <<======== */
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt", true))) { // Open the file in append mode so existing data is preserved and new data is added at the end.
        // // true == append mode (keeps the existing content and adds new content at the end of the file).
        // bw.newLine(); // Move the writing position to a new line before adding new text.
        // bw.write("Appended line"); // Write the text "Appended line" at the end of the file.
        // System.out.println("Successfully appended to the file."); // Print a success message after appending the text.
        // } catch (IOException e) { // Catch any input/output exception that occurs while appending to the file.
        // System.out.println("Error writing file."); // Print an error message if appending fails.
        // }
    }
}