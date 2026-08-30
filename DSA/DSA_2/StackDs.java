import java.util.Stack;

public class StackDs {
   // /* Question 1 ==> Valid parenthesis */
   static boolean isValid(String str) {
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if ((ch == '(') || (ch == '{') || (ch == '[')) {
            stack.push(ch);
         } else {
            if(stack.isEmpty()){
               return false;
            }
            char top = stack.pop();
            if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
               return false;
            }
         }
      }
      return stack.isEmpty();
   }

   public static void main(String[] args) {
      // /* Question 1 ==> Valid parenthesis */
      String str = "({[]})";
      System.out.println("Valid : " + isValid(str));

   }
}
