package L8Function;

public class BinaryToDecimals {

    public static void binToDec(int binNum) {

        int pow = 0;
        int decNum = 0;
        int num = binNum;
        while (binNum > 0) {
            int lsatDigit = binNum % 10;
            decNum += (lsatDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Binary " + num + " to convert decimal number  = " + +decNum);
    }

    public static void main(String[] args) {

        binToDec(1010);
    }
}

// int pow = 0;: Initializes a variable pow to 0. This variable will represent the power of 2 in the conversion process.
// int decNum = 0;: Initializes a variable decNum to 0. This variable will store the calculated decimal equivalent.
// int num = binNum;: Stores the original binary number in the num variable for printing later.
// while (binNum > 0) { ... }: This loop iterates through each digit of the binary number from right to left (least significant to most significant).
// int lsatDigit = binNum % 10;: Extracts the last digit of the binary number using the modulo operator (%).
// decNum += (lsatDigit * Math.pow(2, pow));: Calculates the decimal contribution of the current digit and adds it to decNum. It does this by multiplying the digit (0 or 1) with 2 raised to the power of pow.
// pow++;: Increments pow to prepare for the next digit (which will have a higher power of 2).
// binNum = binNum / 10;: Removes the last digit from binNum by integer division.
// System.out.println("Binary " + num + " to convert decimal number = " + + decNum);: Prints the original binary number (num) and its calculated decimal equivalent (decNum).
