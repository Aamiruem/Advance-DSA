package L11Array;

import java.util.*;

public class updateMarks {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter computer marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter mathematics marks");
        marks[2] = sc.nextInt();

        System.out.println("Phy :" + marks[0]);
        System.out.println("Comp :" + marks[1]);
        System.out.println("Math :" + marks[2]);

        // updated marks
        // marks[2] = 100;
        // System.out.println("Math :" + marks[2]);

        // marks[2] = marks[2]+1;
        // System.out.println("Math :" + marks[2]);

        // find marks percentage
        // int percentage = (marks[0] + marks[1] +marks[2])/3;
        // System.out.println("percentage: = " + percentage + "%");

        // updated marks
        // marks[2] = marks[2] + 1;

        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        System.out.println("length of array = " + marks.length);

    }
}
