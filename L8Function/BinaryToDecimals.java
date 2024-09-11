package L8Function;

public class BinaryToDecimals {
    public static void binToDec(int binNum) {

        int pow = 0;
        int decNum = 0;
        int num = binNum;
        while (binNum > 0) {
            int lsatDigit = binNum % 10;
            decNum += lsatDigit * Math.pow(2, pow);
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Binary " + num + " to convert decimal number  = " + + decNum);
    }
    public static void main(String[] args) {

        binToDec(111);
    }
}
