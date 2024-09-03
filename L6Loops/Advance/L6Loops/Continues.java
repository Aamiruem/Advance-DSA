// package L6Loops;



// public class Continues {

//     public static void main(String[] args) {

//         for (int i = 1; i <= 10; i++) {
//             if (i % 3 == 0) {
//                 continue;
//             }
//             System.out.println("Number: " + i);

//         }
//         System.err.println();
//     }
// }











public class Continues {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("Number: " + i);
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                System.out.println("\tInner Loop: " + j);
            }
            loop: System.out.println("Outer Loop skipped");
            System.out.println("Outer Loop continued");
            if (i == 5) {
                break;
            }
            System.out.println("Outer Loop ended");
        }
    }
}
