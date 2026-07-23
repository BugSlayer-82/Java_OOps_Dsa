import java.util.Queue;
import java.util.LinkedList;

public class OnlyDsaQueue_2 {
    // /* Question 2 ---> Reverse Queue */
    static void reverseQueue(int [] arr){
        Queue<Integer> q = new LinkedList<>();
        for(int i : arr){
            q.offer(i);
        }
        System.out.println(q);
    }
    public static void main(String[] args) {
      
        // /* Question 1 ---> Queue implementation */
        // Queue<Integer> q = new LinkedList<>();
        // q.offer(5);
        // q.add(6);
        // q.add(2);
        // q.offer(4);
        // System.out.println("Peek : " + q.peek());// 2
        // System.out.println("Remove : " + q.remove(2));// removed
        // System.out.println("Poll : " + q.poll()); // removed
        // System.out.println("Size : " + q.size()); // 0
        // System.out.println("Q is empty : " + q.isEmpty());// true
        // System.out.println(q);// empty q

        // /* Question 2 ---> Reverse Queue */
        int []arr = {3,1,2,5,6,7,9};
        reverseQueue(arr);
    }
}
