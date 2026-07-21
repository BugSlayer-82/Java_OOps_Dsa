// import java.util.Stack;
// import java.util.Deque;
// import java.util.ArrayDeque;

public class OnlyDsaStack_1 {

    // /* Question 8 ---> Evaluate Postfix */
    // static int evaluatePostfix(String exp){
    //     Stack<Character> stack = new Stack<>();
    //     Stack<Integer> number = new Stack<>();
    //     System.out.println(stack);
    //     System.out.println(number);
    //     return ans;
    // }

    // /* Question 7 ---> Copy the Stack to another */
    // static void copyStack(Stack<Integer> s1, Stack<Integer> s2) {
    //     if (s1.isEmpty()) {
    //         return;
    //     }
    //     int topElement = s1.pop();
    //     copyStack(s1, s2);
    //     s1.push(topElement);
    //     s2.push(topElement);
    // }

    // /* Question 6 ---> Print and empty Stack */
    // static void printStack(int []arr){
    //     Stack <Integer> stack = new Stack<>();
    //     for(int i : arr){
    //         stack.push(i);
    //     }
    //     System.out.println(stack);
    //     if(stack.isEmpty()){
    //         System.out.println("null");
    //     }
    //     while(!stack.isEmpty()){
    //         stack.pop();
    //     }
    //     System.out.println(stack);
    // }
 
    // /* Question 5 ---> Largest element in Stack */
    // static int largetElement(int[] arr) {
    // Stack<Integer> stack = new Stack<>();
    // for(int i : arr){
    // stack.push(i);
    // }
    // if(stack.isEmpty()){
    // return -1;
    // }
    // int largest = stack.pop();
    // while(!stack.isEmpty()){
    // int top = stack.pop();
    // if(largest < top){
    // largest = top;
    // }
    // }
    // return largest;
    // }

    // /* Question 4 ---> Reverse a Number */
    // static int[] reverseNumber(int[] arr) {
    // Stack<Integer> stack = new Stack<>();
    // for (int i : arr) {
    // stack.push(i);
    // }
    // if (stack.isEmpty()) {
    // return new int[] {};
    // }
    // int[] secArr = new int[arr.length];
    // int i = 0;
    // while (!stack.isEmpty()){
    // secArr[i] = stack.pop();
    // i++;
    // }
    // return secArr;
    // }

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
        // int[] arr = { 3, 2, 9, 1, 6, 4 };
        // for (int i : reverseNumber(arr)) {
        // System.out.print(i + " ");
        // }
        // System.out.println();

        // /* Question 5 ---> Largest element in Stack */
        // int[] arr = { 3, 2, 6, 4, 9, 8, 1 };
        // int result = largetElement(arr);
        // System.out.println("Largest in Stack --> " + result);

        // /* Question 6 ---> Print and empty Stack */
        // int []arr = {3,2,6,4,7,8,9};
        // printStack(arr);

        // /* Question 7 ---> Copy the Stack to another */
        // Stack<Integer> s1 = new Stack<>();
        // Stack<Integer> s2 = new Stack<>();
        // int[] arr = { 2, 3, 5, 4, 8, 6, 7 };
        // for (int i : arr) {
        //     s1.push(i);
        // }
        // copyStack(s1, s2);
        // System.out.println(s1);
        // System.out.println(s2);

        // /* Question 8 ---> Evaluate Postfix */
        // String exp = "3*5+24-3";
        // int result = evaluatePostfix(exp);
        // System.out.println();
    }
}