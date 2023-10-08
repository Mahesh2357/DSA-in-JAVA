package BIt_Manipulation;

//public class DecimalToBinary {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 20; i++) {
//            System.out.println("Decimal: " + i + "\tBinary: " + Integer.toBinaryString(i));
//        }
//    }
//}


public class DecimalToBinary {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            String binary = Integer.toBinaryString(i);
            // Ensure binary representation is exactly 4 digits by adding leading zeros
            while (binary.length() < 4) {
                binary = "0" + binary;
            }
            System.out.println("Decimal: " + i + "\tBinary: " + binary);
        }
    }
}
