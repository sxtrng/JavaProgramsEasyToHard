/**
 * 		This program demonstrates print, println, and printf.  
 * 		System.out.print() does not advance the cursor 
 * 		to a new space nor to a new line.	
 * 		System.out.println() advances the cursor to a new line.  Spaces
 * 		must be manually entered. 
 * 		System.out.printf() is formatted print.  New lines, spaces, etc
 * 		must be manually entered.
 * 		All three print methods take textual or numeric arguments
 *     within double quotes  These are strings even if numeric.
 * 		System.out.printf() has format specifiers.
 * 		In another repository are in depth explanations.
 */
public class JavaOne {
	public static void main(String[] args) {
	
		System.out.print(100);
		System.out.print("years is a");
		System.out.print("century.");
	
		System.out.println("\n" + 100 + " " + "years is a century.");
		System.out.println("100 years is a century.");
	
		System.out.printf("100 years is a century.\n");
		System.out.printf("\t100 years is a century.\n");
	
	
		System.exit(0);
	}
}
