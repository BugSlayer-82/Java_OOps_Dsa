public class ExceptionHandling {
    public static void main(String []args){
        // /* Here is the basic implementation of try-catch in Exception Handling */
        try{
            int [] arr = {2,5,6,7,9};
            System.out.println(arr[8]);
        }catch(Exception e){
            System.out.println("Something went wrong ..!");
        }finally{
            System.out.println("The 'try catch' is finished ...!");
        }

        // /* Here is an example of --> throw <--- keyword */
        int age = 19;
        if(age < 18){
            throw new ArithmeticException("Access denied - You must be 18 year old ..");
        }else{
            System.out.println("Access granted - You are old enough ..");
        }
    }
}
