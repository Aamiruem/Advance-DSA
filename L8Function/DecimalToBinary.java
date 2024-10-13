package L8Function;

public class DecimalToBinary {

    public static void binToDec(int decNum) {

        int pow = 0;
        int binNum = 0;
        int num = decNum;
        while (decNum > 0) {
            int rem = decNum % 2; //finding for remainder
            binNum += (rem * Math.pow(10, pow));
            pow++;
            decNum = decNum / 2; //finding for digit from back deal with one by one
        }
        System.out.println("Decimal " + num + " to convert binary number  = " + +binNum);
    }

    public static void main(String[] args) {

        binToDec(11);
    }
}




// package L8Function;

// public class DecimalToBinary {

//     public static void decToBin(int decNum) {
//         int pow = 0;
//         int binNum = 0;
//         int num = decNum;

//         while (decNum > 0) {
//             int lastDigit = decNum % 2;  // Get the binary digit
//             binNum += (lastDigit * Math.pow(10, pow));  // Append it to binary number
//             pow++;
//             decNum = decNum / 2;  // Divide by 2 to get the next binary digit
//         }

//         System.out.println("Decimal " + num + " converted to binary number = " + binNum);
//     }

//     public static void main(String[] args) {
//         decToBin(7);  // Test the function
//     }
// }
