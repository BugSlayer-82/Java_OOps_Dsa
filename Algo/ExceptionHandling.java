import java.io.IOException;
import java.io.FileOutputStream;

public class ExceptionHandling {
    public static void main(String[] args) {
        // /* Here is the basic implementation of try-catch in Exception Handling */
        // try{
        // int [] arr = {2,5,6,7,9};
        // System.out.println(arr[8]);
        // }catch(Exception e){
        // System.out.println("Something went wrong ..!");
        // }finally{
        // System.out.println("The 'try catch' is finished ...!");
        // }

        // /* Here is an example of --> throw <--- keyword */
        // int age = 19;
        // if(age < 18){
        // throw new ArithmeticException("Access denied - You must be 18 year old ..");
        // }else{
        // System.out.println("Access granted - You are old enough ..");
        // }

        // /* Here is the basic implementation of Multiple Exception or one ( try many
        // catch ) */
        // try {
        //     int[] nums = { 1, 5, 6 };
        //     System.out.println(nums[4]);
        //     int result = 10 / 0;
        //     System.out.println(result);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index does not exist .");
        // } catch (ArithmeticException e) {
        //     System.out.println("Cannot divide by zero .");
        // } catch (Exception e) {
        //     System.out.println("Something else went wrong .");
        // }

        // /* Order Matters ( Bad Order ) */
        // try{
        //     int result = 10/0;
        // }
        // catch(Exception e){ // Tip : Always put 'Exception' (the general one) at the end
        //     System.out.println("General error");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by zero");
        // }
        
        // /* Here is the basic implementation of Multi Catch  */
        // try{
        //     int result = 10/0;
        //     int []numbers = {1,2,3,4};
        //     System.out.println(numbers[7]);
        // }catch(ArithmeticException| ArrayIndexOutOfBoundsException e){
        //     System.out.println("Math error or array error occured .");
        // }

        // -----------> Java try with resources <----------- */
        // /* Java close Resources */
        // try{
        //     FileOutputStream output = new FileOutputStream("example.txt");
        //     output.write("Hello".getBytes());
        //     output.close(); // Must close manually
        //     System.out.println("Successfully wrote to the file .");
        // }catch(IOException e){
        //     System.out.println("Error writing file .");
        // }

        // /* Java try with Resources */
        // try(FileOutputStream output = new FileOutputStream("example.txt")){
        //     output.write("Hello".getBytes());
        //     // no need to call 'close()' here
        //     System.out.println("Successfully wrote to the file .");
        // }catch(IOException e){
        //     System.out.println("Error writing file .");
        // }
    }
}
