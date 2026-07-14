// import java.util.Stack;
// import java.util.ArrayDeque;
// import java.util.Deque;

public class OnlyDsaProblem_1 {
    // /* Question 7 ---> Evaluate Postfix */

    // /* Question 6 ---> Copy the Stack to another */

    // /* Question 5 ---> Largest element in Stack */

    // /* Question 4 ---> Reverse a Number */

    // /* Question 3 ---> Reverse a String */
    // static String reverseString(String s){
    // if(s == null || s.length() <= 1){
    // return s;
    // }
    // Deque<Character> stack = new ArrayDeque<>(); // Creating Stack through
    // ArrayDeque
    // for(int i = 0; i < s.length(); i++){
    // stack.push(s.charAt(i));
    // }
    // StringBuilder sb = new StringBuilder();
    // while(!stack.isEmpty()){
    // sb.append(stack.pop());
    // }
    // return sb.toString();
    // }

    // /* Question 2 ---> Balanced Parantheses */
    // static boolean isValid(String s){
    // Stack<Character> stack = new Stack<>();
    // char [] ch = s.toCharArray();
    // for(int i = 0; i < s.length(); i++){
    // if(ch[i] == '('||ch[i] == '{'|| ch[i] == '['){
    // stack.push(ch[i]);
    // }
    // else{
    // if(stack.isEmpty()){
    // return false;
    // }
    // char top = stack.pop();
    // if((top == '(' && ch[i] != ')') || (top == '{'&& ch[i] != '}') ||(top ==
    // '['&& ch[i] != ']')){
    // return false;
    // }
    // }
    // }
    // return stack.isEmpty();
    // }

    // /* Question 1 ---> Stack implementation */
    // static void useStack(String[] words) {
    // Stack<String> stack = new Stack<>();
    // for (String str : words) {
    // stack.push(str);
    // }
    // while (!stack.isEmpty()) {
    // System.out.println(stack.pop());
    // }
    // }

    public static void main(String[] args) {

        // /* Question 1 ---> Stack implementation */
        // String[] words = { "implementation", "Stack", "basic", "is", "This" };
        // useStack(words);

        // /* Question 2 ---> Balanced Parantheses */
        // String s = "(){}[]";
        // System.out.println("Is valid --> "+isValid(s));

        // /* Question 3 ---> Reverse a String */
        // String s = "hello";
        // System.out.println("Reversed String --> "+ reverseString(s));

        // /* Question 4 ---> Reverse a Number */

        // /* Question 5 ---> Largest element in Stack */

        // /* Question 6 ---> Copy the Stack to another */

        // /* Question 7 ---> Evaluate Postfix */
    }
}