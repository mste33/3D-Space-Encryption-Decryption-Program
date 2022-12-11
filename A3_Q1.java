// -------------------------------------------------------
// Assignment {3}
// Written by: {Mustafa Ahmad 40196075}
// For COMP 248 Section {EC} – Fall 2022
// --------------------------------------------------------
/*This program is used to encrypt and decrypt messages. 
 * 
 * Firstly the user is greeted with a welcome message, and is asked to enter a sentence.
 * The sentence is then processed, and the user is shown the encrypted/decrypted text.
 * The user is shown a goodbye message.

 */
package ass_3;
import java.util.Scanner;
public class A3_Q1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.println("Welcome to the 3D-Space Encryption-Decryption Program:");  //welcome message
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		System.out.println("Please enter your plain text below:");

		String sentence = x.nextLine();
		sentence = sentence.trim(); //spaces are removed from use input.
		String newsentence = "";

		System.out.println("");
		System.out.println("Kindly find below your encrypted text output:");
		if (sentence.length() % 2 == 0){ //if the sentence is even then this loop is executed
			for (int i = 1 ; i < sentence.length() ; i += 2 ) //1st and 2nd characters in the string are swapped, 3rd and 4th characters are swapped and so forth.
				newsentence += Character.toString(sentence.charAt(i)) + Character.toString(sentence.charAt(i-1));
		}

		else if (sentence.length() % 2 != 0) { //if the sentence is odd then this loop is executed
			newsentence = sentence.substring(0,1); 
			for (int j = 2 ; j < sentence.length() ; j += 2 ) { // First character stays the same, and then the 2nd and 3rd characters are swapped, and then the 4th and 5th characters are swapped and so forth.
				newsentence += Character.toString(sentence.charAt(j)) + Character.toString(sentence.charAt(j-1));

			}
		}

		System.out.println(newsentence); //prints out encrypted text.
		System.out.println();
		System.out.println("Thank you for your contribution to this Space Project."); //close message
		x.close();



	}
}
