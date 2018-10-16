//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
		if( randomNumber ==0) {
			for (int i=0; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "You're nice!");
			}
		}
		if( randomNumber ==1) {
			for (int i=1; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "Such a kind person!");
			}
		}
		if( randomNumber ==2) {
			for (int i=2; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "You're friendly", null, randomNumber);
			}
		}
		if (randomNumber ==3) {
			for (int i=3; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "Wow you're great!");
			}
		}
		if ( randomNumber ==4) {
			for (int i=4; i < 10; i++) {
			JOptionPane.showMessageDialog(null, "Wow you're handsome");
			}
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
