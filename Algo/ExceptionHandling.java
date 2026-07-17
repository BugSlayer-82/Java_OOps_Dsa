// import java.io.IOException; // Import the IOException class to handle input/output related errors.
// import java.io.FileOutputStream; // Import the FileOutputStream class to write binary data (bytes) into a file.

public class ExceptionHandling {
    public static void main(String[] args) {
        // /* ======>> Here is the Basic Implementation of try-catch in Exception
        // Handling <<=======*/
        // try { // Start the try block. Put the code here that may generate an
        // exception.
        // int[] arr = {2, 5, 6, 7, 9}; // Create an integer array with 5 elements.
        // System.out.println(arr[8]); // Try to access index 8. This index does not
        // exist, so an exception will occur.
        // } catch (Exception e) { // Catch any type of exception generated inside the
        // try block.
        // System.out.println("Something went wrong ..!"); // Print a user-friendly
        // error message instead of stopping the program.
        // } finally { // The finally block always executes, whether an exception occurs
        // or not.
        // System.out.println("The 'try catch' is finished ...!"); // Print a message
        // indicating that exception handling is complete.
        // }

        // /* =======>> Here is an Example of ( throw <-- Keyword) <<======= */
        // int age = 19; // Store the user's age in a variable.
        // if (age < 18) { // Check whether the age is less than 18.
        // throw new ArithmeticException("Access denied - You must be 18 year old ..");
        // // Manually throw an exception with a custom message.
        // } else { // Execute this block if the age is 18 or greater.
        // System.out.println("Access granted - You are old enough .."); // Print a
        // success message because the condition is satisfied.
        // }

        // /* ==========>> Here is the Basic Implementation of Multiple Exceptions (One
        // try, Many
        // catch) <<=========*/
        // try { // Start the try block. Any exception generated here will be checked
        // against the catch blocks.
        // int[] nums = {1, 5, 6}; // Create an integer array containing three elements.
        // System.out.println(nums[4]); // Try to access index 4. This index does not
        // exist, so an ArrayIndexOutOfBoundsException will occur.
        // int result = 10 / 0; // Divide a number by zero. This would cause an
        // ArithmeticException, but this line is never reached because the previous
        // exception already occurred.
        // System.out.println(result); // Print the result if no exception occurs.
        // } catch (ArrayIndexOutOfBoundsException e) { // Catch the exception for an
        // invalid array index.
        // System.out.println("Array index does not exist."); // Print a message
        // explaining the array index error.
        // } catch (ArithmeticException e) { // Catch the exception caused by division
        // by zero.
        // System.out.println("Cannot divide by zero."); // Print a message explaining
        // the arithmetic error.
        // } catch (Exception e) { // Catch any other exception that is not handled
        // above.
        // System.out.println("Something else went wrong."); // Print a general error
        // message.
        // }

        // /* =============>> Order Matters (This is Bad Order) <<============== */
        // try { // Start the try block. The code that may generate an exception is
        // written here.
        // int result = 10 / 0; // Divide a number by zero. This will generate an
        // ArithmeticException.
        // }
        // catch (Exception e) { // This is the general exception handler. It should
        // always be placed at the end.
        // // Tip: Always put 'Exception' (the general exception class) at the end
        // because it can catch every type of exception.
        // System.out.println("General error"); // Print a general error message.
        // }
        // catch (ArithmeticException e) { // This catch block will never be reached
        // because Exception already catches everything above.
        // System.out.println("Divide by zero"); // Print a message for division by
        // zero.
        // }

        // /* =============>> Here is the Basic Implementation of Multi-Catch
        // <<============== */
        // try { // Start the try block.
        // int result = 10 / 0; // This line throws an ArithmeticException.
        // int[] numbers = {1, 2, 3, 4}; // Create an integer array.
        // System.out.println(numbers[7]); // This line would throw an
        // ArrayIndexOutOfBoundsException, but it is never executed because the previous
        // line already throws an exception.
        // }
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // Catch
        // either an ArithmeticException or an ArrayIndexOutOfBoundsException using one
        // catch block.
        // System.out.println("Math error or array error occurred."); // Print a common
        // message for both exceptions.
        // }

        // /* ===============>> Java try-with-resources <<============== */
        // /* ===============>> Java Close Resources <<============== */
        // try { // Start the try block.
        // FileOutputStream output = new FileOutputStream("example.txt"); // Create a
        // FileOutputStream object to write data into the file.
        // output.write("Hello".getBytes()); // Convert the string "Hello" into bytes
        // and write it to the file.
        // output.close(); // Close the stream manually to save data and release system
        // resources.
        // System.out.println("Successfully wrote to the file."); // Print a success
        // message.
        // } catch (IOException e) { // Catch any input/output exception that occurs
        // while writing to the file.
        // System.out.println("Error writing file."); // Print an error message.
        // }

        // /* ==================>> Java try-with-resources <<============== */
        // try (FileOutputStream output = new FileOutputStream("example.txt")) { //
        // Create a FileOutputStream object. It will be closed automatically after the
        // try block finishes.
        // output.write("Hello".getBytes()); // Convert the string "Hello" into bytes
        // and write it to the file.
        // // No need to call close() here because try-with-resources closes the stream
        // automatically.
        // System.out.println("Successfully wrote to the file."); // Print a success
        // message.
        // } catch (IOException e) { // Catch any input/output exception that occurs
        // while writing to the file.
        // System.out.println("Error writing file."); // Print an error message.
        // }
    }
}
