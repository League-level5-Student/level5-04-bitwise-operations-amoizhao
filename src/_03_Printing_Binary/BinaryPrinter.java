package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place

		// Shift b seven bits to the right
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		
		System.out.println((b>>7) & 1);
		System.out.println((b>>6) & 1);
		System.out.println((b>>5) & 1);
		System.out.println((b>>4) & 1);
		System.out.println((b>>3) & 1);
		System.out.println((b>>2) & 1);
		System.out.println((b>>1) & 1);
		System.out.println((b>>0) & 1);
		
		// Print the result using System.out.print (NOT System.out.println)
		//Use this method to print the remaining 7 bits of b
	}
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte b1, b2;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		b1 = (byte) (((s>>8) & 1));
		b2 = (byte) ((byte) ((s<<8) & 1));
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(b1);
		printByteBinary(b2);
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		short s1, s2;
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		s1 = (short) ((i>>16) & 1);
		s2 = (short) ((i<<16) & 1);
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
		printShortBinary(s1);
		printShortBinary(s2);
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
		short s1, s2;
		s1 = (short) ((l>>16) & 1);
		s2 = (short) ((l<<16) & 1);
		printShortBinary(s1);
		printShortBinary(s2);
	}
	
	public static void main(String[] args) {
		// Test your methods here
		//byte b = new Byte((byte) 37);
		//printByteBinary(b);
		short s = new Short((short) 57);
		printShortBinary(s);
	}
}
