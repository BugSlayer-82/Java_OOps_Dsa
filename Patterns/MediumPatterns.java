package Java_OOps_Dsa.Patterns;

class MedSolution {
    // * Question 1 --> Tiangular pattern of Alphabets right half pyramid */
    public void rightHalf(char ch) {
        /* print alphabet in columns */
        for (char c = 'A'; c <= ch; c++) { // Outer loop
            for (char d = 'A'; d <= c; d++) { // Inner loop
                System.out.print(d + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
        /* print aplhabet in rows */
        for (char c = 'A'; c <= ch; c++) {
            for (char d = 'A'; d <= c; d++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // * Question 2 --> Tiangular pattern of Alphabets in sequence right half
    // pyramid */
    public void invertedRightHalf(char ch) {
        
    }
}

public class MediumPatterns {
    public static void main(String[] args) {
        MedSolution sol = new MedSolution();
        // sol.rightHalf('G');
        sol.invertedRightHalf('F');
    }
}
