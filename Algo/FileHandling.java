// import java.io.File; // Import the File class to create, access, and manage files.
// import java.util.Scanner; // Import the Scanner class to read data from text files.
// import java.io.FileWriter; // Import the FileWriter class to write data into a file.
// import java.io.IOException; // Import the IOException class to handle input/output errors.
// import java.io.FileNotFoundException; // Import this class to handle the error when a file is not found.

public class FileHandling { // Create a class named FileHandling.
    public static void main(String[] args) { // Main method where the program starts execution.

        // /* Some Important methods of io package of File class */
        // canRead() --> Checks whether the file can be read or not. (Returns boolean)
        // canWrite() --> Checks whether the file can be written or not. (Returns
        // boolean)
        // createNewFile() --> Creates a new empty file if it does not already exist.
        // (Returns boolean)
        // delete() --> Deletes the file. (Returns boolean)
        // exists() --> Checks whether the file exists or not. (Returns boolean)
        // getName() --> Returns only the name of the file. (Returns String)
        // getAbsolutePath() --> Returns the complete path of the file. (Returns String)
        // length() --> Returns the size of the file in bytes. (Returns long)
        // list() --> Returns an array containing the names of files and folders inside
        // a directory. (Returns String[])
        // mkdir() --> Creates a new directory (folder). (Returns boolean)

        // /* =========>> Basic Example of Creating a File Object <<============ */
        // File myFile = new File("Example.txt"); // Create a File object that
        // represents "Example.txt". It does not create the actual file.

        // /* ==========>> Basic File Object Declaration Syntax <<=============== */
        // /* =======>> Java Create a File <<============ */
        // try { // Start a try block because createNewFile() may throw an IOException.
        // File myFile = new File("Example.txt"); // Create a File object for
        // "Example.txt".
        // // File myFile = new File("/Users/kashif/Documents/Example.txt"); // Create a
        // File object for a file inside a specific folder.
        // // Use this when you want to create or access a file at a custom location.
        // if (myFile.createNewFile()) { // Try to create the file. Returns true if the
        // file is created successfully.
        // System.out.println("File created: " + myFile.getName()); // Print the name of
        // the newly created file.
        // } else { // This block runs if the file already exists.
        // System.out.println("File already exists."); // Inform the user that the file
        // is already present.
        // }
        // } catch (IOException e) { // Catch any input/output exception that occurs
        // during file creation.
        // System.out.println("An error occurred."); // Print a simple error message.
        // e.printStackTrace(); // Print the complete error details to help with
        // debugging.
        // }

        // /* ========>> Java Write to File without (try-with-resources) <<======== */
        // try { // Start a try block because writing to a file may throw an
        // IOException.
        // FileWriter myFile = new FileWriter("Example.txt"); // Create a FileWriter
        // object to write data into "Example.txt". If the file does not exist, it will
        // be created.
        // String str = "This is a file named Example.txt"; // Create a string that will
        // be written into the file.
        // myFile.write(str); // Write the string into the file.
        // myFile.close(); // Close the FileWriter manually. This is important to save
        // the data and free system resources.
        // System.out.println("Successfully wrote to the file."); // Print a success
        // message after writing is completed.
        // } catch (IOException e) { // Catch any IOException that occurs while writing
        // to the file.
        // System.out.println("An error occurred."); // Print a simple error message.
        // e.printStackTrace(); // Print the complete exception details for debugging.
        // }

        // /* ==========>> Java Write to File with (try-with-resources) */
        // try (FileWriter myFile = new FileWriter("Example.txt")) { // Create a
        // FileWriter object. It will be closed automatically when the try block ends.
        // // /* FileWriter will be closed automatically here in this method of code */
        // String str = "This is a file name call Example.txt"; // Create a string that
        // will be written into the file.
        // myFile.write(str); // Write the string into the file.
        // System.out.println("Successfully wrote to the file."); // Print a success
        // message after writing is completed.
        // } catch (IOException e) { // Catch any IOException that occurs while writing
        // to the file.
        // System.out.println("An error occurred."); // Print a simple error message.
        // e.printStackTrace(); // Print complete error details for debugging.
        // }

        // /* ==========>> Java Append to a File with (try-with-resources) */
        // try (FileWriter myFile = new FileWriter("Example.txt", true)) { // Open the
        // file in append mode. Existing data will not be deleted.
        // // /* While creating the FileWriter object, append mode is set to true. */
        // String str = "\n Appended text !"; // Create a string to add at the end of
        // the file. '\n' starts the text on a new line.
        // myFile.write(str); // Append the string to the end of the file.
        // System.out.println("Successfully appended to the file."); // Print a success
        // message after appending the data.
        // } catch (IOException e) { // Catch any IOException that occurs during the
        // append operation.
        // System.out.println("An error occurred."); // Print a simple error message.
        // e.printStackTrace(); // Print complete error details for debugging.
        // }

        // /* ======>> Java Read Files with (try-with-resources) <<======= */
        // File myFile = new File("Example.txt"); // Create a File object that
        // represents "Example.txt".
        // try (Scanner readFile = new Scanner(myFile)) { // Create a Scanner object to
        // read the file. It will be closed automatically.
        // while (readFile.hasNextLine()) { // Keep reading until there are no more
        // lines left in the file.
        // String data = readFile.nextLine(); // Read one line from the file and store
        // it in the variable 'data'.
        // System.out.println(data); // Print the current line on the console.
        // }
        // } catch (FileNotFoundException e) { // Catch the exception if the file does
        // not exist.
        // System.out.println("An error occurred."); // Print a simple error message.
        // e.printStackTrace(); // Print complete error details for debugging.
        // }

        // /* ===============>> Get File Information <<=============== */
        // File myFile = new File("Example.txt"); // Create a File object that
        // represents "Example.txt".
        // if (myFile.exists()) { // Check whether the file exists before accessing its
        // information.
        // System.out.println("File name --> " + myFile.getName()); // Print only the
        // name of the file.
        // System.out.println("Absolute path --> " + myFile.getAbsolutePath()); // Print
        // the complete path of the file.
        // System.out.println("Writable --> " + myFile.canWrite()); // Check and print
        // whether the file can be written to.
        // System.out.println("Readable --> " + myFile.canRead()); // Check and print
        // whether the file can be read.
        // System.out.println("File size in bytes --> " + myFile.length()); // Print the
        // size of the file in bytes.
        // } else { // Execute this block if the file does not exist.
        // System.out.println("The file does not exist."); // Inform the user that the
        // file is not available.
        // }

        // /* ======>> Java Delete Files without (try-with-resources) <<======= */
        // File myFile = new File("Example.txt"); // Create a File object for the file
        // to be deleted.
        // if (myFile.delete()) { // Try to delete the file. Returns true if deletion is
        // successful.
        // System.out.println("Deleted file --> " + myFile.getName()); // Print the name
        // of the deleted file.
        // } else { // Execute this block if the file could not be deleted.
        // System.out.println("Failed to delete the file."); // Inform the user that the
        // deletion failed.
        // }

        // /* ======>> Java Delete Folder without (try-with-resources) <<======= */
        // File myFile = new File("//home//popoye-80//Example"); // Create a File object
        // that represents the folder to be deleted.
        // if (myFile.delete()) { // Try to delete the folder. The folder must be empty
        // for this method to work.
        // System.out.println("Deleted the folder --> " + myFile.getName()); // Print
        // the name of the deleted folder.
        // } else { // Execute this block if the folder could not be deleted.
        // System.out.println("Failed to delete the folder."); // Inform the user that
        // the folder deletion failed.
        // }
    }
}
