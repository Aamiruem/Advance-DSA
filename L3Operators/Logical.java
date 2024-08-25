// package Advance-DSA.L3Operators;

public class Logical {
    public static void main(String[] args) {
        int x = 200;
        int y = 50;
        int z = 100;

        if(x > y && y > z){
            System.out.println("All conditions are true " + "Hello");
        } else{
            System.out.println("At least one condition is false " + "world");
        }

        if(z > y && z < x){
            System.out.println("Condition z > y && z < x is true " + "java");
        } else{
            System.out.println("Condition z > y && z < x is false " + "programming");
        }

        if(!(x > y && x > z)){
            System.out.println("Condition!(x > y && x > z) is true " + "world");
        } else{
            System.out.println("Condition!(x > y && x > z) is false " + "programming");
        }

        if((y + 200) < x && (y + 150) < z){
            System.out.println("Condition (y + 200) < x && (y + 150) < z is true " + "code");
        } else{
            System.out.println("Condition (y + 200) < x && (y + 150) < z is false " + "programming");
        }
        
        System.err.println("Hello java");
        System.out.println(x > y && x > z);//true
        System.out.println(x > y || x < z); //true
    }
}
