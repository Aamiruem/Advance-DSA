public class Greater3Number {
    public static void main(String[] args) {
        int A = 10, B = 12, C = 11;
        
        if ((A > B) && (A > C)) {
            System.out.println("The largest number is A: " + A);
        } else if ((B > A) && (B > C)) {
            
            // } else if(B > C){
            // System.out.println("The largest number is B: " + B);
            // }

            System.out.println("The largest number is B: " + B);
        } else {
            System.out.println("The largest number is C: " + C);
    
            // Check if A, B, and C are all equal
            if (A == B && B == C) {
                System.out.println("A, B, and C are all equal: " + A);
            }
        }
    }
}
