import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Name Display
 *	Project Description: This program 
 *	is intended to display a random element 
 *	in the array until all of the elements 
 *	in the array are displayed.
 * 
 **/

public class Display_Array {


	static String names[] = {"James", "John", "simon", "Alex", "Tim", "Sam", "Max", "ben", "Phill", "Carl"};
	static boolean elements_displayed[] = {false, false, false, false, false, false, false, false, false, false};
	static int display_counter = 0;
	
	public static void main(String[] args){
		Random ran = new Random();
		while(display_counter != elements_displayed.length){
			int temp = ran.nextInt(names.length);
			if(!elements_displayed[temp]){
				elements_displayed[temp] = ! elements_displayed[temp];
				display_counter++;
			}// End of if elements_displayed
			println(names[temp]);
		}// End of while
	}// End of main method
	
	public static void print(String input){
		System.out.print(input);
	}// End of print
	
	public static void println(String input){
		print(input + "\n");
	}// End of println
	
	public static void print(int input){
		print(input + "");
	}// End of print
	
	public static void println(int input){
		print(input + "\n");
	}// End of println
}
