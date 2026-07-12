class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// /* Question 2 ------> Add Two Numbers of linked list  */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode secl1 = l1;
        ListNode secl2 = l2;
        int sum = 0, carry = 0;
        int x = 0, y = 0;
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        while (secl1 != null || secl2 != null) {
            if (secl1 == null) {
                x = 0;
            } else {
                x = secl1.val;
                secl1 = secl1.next;
            }
            if (secl2 == null) {
                y = 0;
            } else {
                y = secl2.val;
                secl2 = secl2.next;
            }
            sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

public class LeetCode_2 {
    // ---- VS CODE MEIN RUN KARNE KE LIYE MAIN METHOD ----
    public static void main(String[] args) {
        // Example ki pehli list banate hain: 2 -> 4 -> 3 (yani 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Example ki doosri list banate hain: 5 -> 6 -> 4 (yani 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Solution class ka object banakar aapke function ko call karenge
        Solution solver = new Solution();
        ListNode result = solver.addTwoNumbers(l1, l2);

        // Result ko screen par print karne ke liye ek simple loop
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
        System.out.println();
    }
}