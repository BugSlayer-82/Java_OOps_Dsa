// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.IOException;
// import java.io.BufferedWriter;
// import java.io.BufferedReader;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;

public class FileIOStream {
    public static void main(String[] args) {
        // /* ===========>> Types of Streams <<========= */
        // 1 ==> Byte Streams : Works with raw Binary data (like images,audio,and PDF)
        // files
        // 2 ==> Character Streams : Work with text (Character and strings),These
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
        // /* ======>> Write a Text File with (try-with-resources) <<======== */
        // String text = "This is example file";
        // try(FileOutputStream myOutput = new FileOutputStream("Example.txt")){
        // myOutput.write(text.getBytes()); // Convert text to bytes and write
        // System.out.println("Successfully wrote to file.");
        // }catch(IOException e){
        // System.out.println("Error writing file. ");
        // e.printStackTrace();
        // }

        // /* =======>> Copy a Binary File <<========= */
        // try(FileInputStream myInput = new FileInputStream("image.jpg");
        // FileOutputStream myOutput = new FileOutputStream("copy.jpg")){
        // int b;
        // while ((b = myInput.read()) != -1) {
        // myOutput.write(b);
        // }
        // System.out.println("File copied successfully.");
        // }catch(IOException e){
        // System.out.println("Error handling file.");
        // }

        // /* =======>> Append to a File <<========= */
        // String text = " \n Appended Text";
        // try (FileOutputStream myOutput = new FileOutputStream("Example.txt", true)) { // true = append mode (keeps
        //                                                                               // existing content)
        //     myOutput.write(text.getBytes());
        //     System.out.println("Successfully appended to file.");
        // } catch (IOException e) {
        //     System.out.println("Error writing file.");
        //     e.printStackTrace();
        // }

        // /* =======>> Here is the basic implementation of BufferedReader */
        // try(BufferedReader br = new BufferedReader(new FileReader("Example.txt"))){
        //     String line;
        //     while((line = br.readLine())!= null){
        //         System.out.println(line);
        //     }
        // }catch(IOException e){
        //     System.out.println("Error reading file.");
        // }

        // /* =======>> Here is the basic implementation of BufferedWriter */
        // /* ======>> Write to a Text File with (try-with-resources) <<======== */
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt"))){
        //     bw.write("First line");
        //     bw.newLine(); // add Line break
        //     bw.write("Second line");
        //     System.out.println("Successfully wrote to the file .");
        // }catch(IOException e){
        //     System.out.println("Error writing file.");
        // }

        // /* ======>> Append to a Text File with (try-with-resources) <<======== */
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt",true))){  // true == append mode
        //     bw.newLine(); // move to the new line
        //     bw.write("Appended line"); // add new text at the end
        //     System.out.println("Successfully appended to the file .");
        // }catch(IOException e){
        //     System.out.println("Error writing file.");
        // }

    }
}