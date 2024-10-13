// package L2VariableAndDataTypes;
// public class MemoryConversion {
//     public static void main(String[] args) {
//         // Using byte (8-bit signed integer)
//         byte megabytesByte = 1;
//         short kilobytesFromByte = (short) (megabytesByte * 1024);
//         int bytesFromByte = kilobytesFromByte * 1024;
//         System.out.println(megabytesByte + " MB (byte) = " + kilobytesFromByte + " KB (short) = " + bytesFromByte + " Bytes (int)");

//         // Using short (16-bit signed integer)
//         short megabytesShort = 1;
//         int kilobytesFromShort = megabytesShort * 1024;
//         long bytesFromShort = kilobytesFromShort * 1024L;
//         System.out.println(megabytesShort + " MB (short) = " + kilobytesFromShort + " KB (int) = " + bytesFromShort + " Bytes (long)");

//         // Using int (32-bit signed integer)
//         int megabytesInt = 1;
//         long kilobytesFromInt = megabytesInt * 1024L;
//         long bytesFromInt = kilobytesFromInt * 1024L;
//         System.out.println(megabytesInt + " MB (int) = " + kilobytesFromInt + " KB (long) = " + bytesFromInt + " Bytes (long)");

//         // Using long (64-bit signed integer)
//         long megabytesLong = 1L;
//         long kilobytesFromLong = megabytesLong * 1024L;
//         long bytesFromLong = kilobytesFromLong * 1024L;
//         System.out.println(megabytesLong + " MB (long) = " + kilobytesFromLong + " KB (long) = " + bytesFromLong + " Bytes (long)");
//     }
// }



package L2VariableAndDataTypes;
public class MemoryConversions {
    public static void main(String[] args) {
        // Initializing 1 MB as an int
        int megabytes = 1;
        
        // Conversion to kilobytes and bytes
        int kilobytes = megabytes * 1024;
        int bytes = kilobytes * 1024;
        
        // Displaying the conversions
        System.out.println(megabytes + " MB = " + kilobytes + " KB = " + bytes + " Bytes");
        
        // Primitive type conversions
        // Converting int to other types
        short shortKilobytes = (short) kilobytes;
        byte byteKilobytes = (byte) kilobytes;  // Will result in overflow since 1024 > 127
        long longBytes = (long) bytes;
        float floatBytes = (float) bytes;
        double doubleBytes = (double) bytes;
        
        // Displaying the conversions to different types
        System.out.println("Kilobytes as short: " + shortKilobytes);
        System.out.println("Kilobytes as byte (overflowed): " + byteKilobytes);
        System.out.println("Bytes as long: " + longBytes);
        System.out.println("Bytes as float: " + floatBytes);
        System.out.println("Bytes as double: " + doubleBytes);
    }
}
