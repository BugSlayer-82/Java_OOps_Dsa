import java.io.File; // Import the File class
// import java.util.Scanner; // Import the Scanner class to read text files
// import java.io.FileWriter; // Import the FileWriter class 
// import java.io.IOException; // Import the IOException class to handle errors
// import java.io.FileNotFoundException; // Import this class to handle errors

public class FileHandling {
    public static void main(String[] args) {
        // /* Some Important methods of io package of file class */
        // canRead() --> Test whether file is readable or not (Boolean)
        // canWrite() --> Test whether file is writable or not (Boolean)
        // createNewFile() --> Creates an empty file (Boolean)
        // delete() --> Deletes a file (Boolean)
        // exists() --> Test whether the file exists (Boolean)
        // getName() --> Returns the name of file (String)
        // getAbsolutePath() --> Returns the absolute pathname of the file (String)
        // length() --> Return the size of the file in bytes (Long)
        // list() --> Return an array of the file in bytes (String [])
        // mkdir() --> Creates a directory (Boolean)

        // /* =========>> Basic example of create file object <<============ */
        // File myFile = new File("Example.txt");

        // /* ==========>> Basic file object declaration Syntax <<=============== */
        // /* =======>> Java Create a File <<============ */
        // try {
        // File myFile = new File("Example.txt"); // Create file object
        // // File myFile = new File("/Users/kashif/Documents/Example.txt"); // To use
        // when
        // // create a file in a specific folder
        // if (myFile.createNewFile()) { // Try to create file
        // System.out.println("File created: " + myFile.getName()); // Print the name of
        // file
        // } else {
        // System.out.println("File already exists .");
        // }
        // } catch (IOException e) {
        // System.out.println("An error occurred");
        // e.printStackTrace(); // Print error detail
        // }

        // /* ========>> Java Write to File without (try with resouces) <<======== */
        // try{
        // FileWriter myFile = new FileWriter("Example.txt");
        // String str = "This is a file name call Example.txt";
        // myFile.write(str); // To write some string into the file
        // myFile.close(); // Must close the FileWriter manually with this method of
        // code
        // System.out.println("Successfully wrote to the file .");
        // }catch(IOException e){
        // System.out.println("An error occurrred .");
        // e.printStackTrace();
        // }

        // /* ==========>> Java Write to File with (try-with-resources) */
        // try(FileWriter myFile = new FileWriter("Example.txt")){
        // // /* FileWriter will be closed automatically here in this method of code */
        // String str = "This is a file name call Example.txt";
        // myFile.write(str); // To write some string into the file
        // System.out.println("Successfully wrote to the file .");
        // }catch(IOException e){
        // System.out.println("An error occurred .");
        // e.printStackTrace();
        // }

        // /* ==========>> In Java Append to a File with (try-with-resources) */
        // try(FileWriter myFile = new FileWriter("Example.txt",true)){
        // // /* At the time of creating object, I have turn the append mode = true */
        // String str = "\n Appended text !";
        // myFile.write(str);
        // System.out.println("Successfulle append to the file .");
        // }catch(IOException e){
        // System.out.println("An error occurred .");
        // e.printStackTrace();
        // }

        // /* ======>> Java Read Files with (try with resouces) <<======= */
        // File myFile = new File("Example.txt");
        // try(Scanner readFile = new Scanner(myFile)){ // Scanner will be closed automatically
        //     while(readFile.hasNextLine()){
        //         String data = readFile.nextLine();
        //         System.out.println(data);
        //     }
        // }catch(FileNotFoundException e){
        //     System.out.println("An error occurred .");
        //     e.printStackTrace();
        // }

        // /* ======>> Java Delete Files with (try with resouces) <<======= */
            File myFile = new File("Example.txt");
    }
}
