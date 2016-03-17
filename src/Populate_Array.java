import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Populating an array
 *	Project Description: This program 
 *	is intended to get an input from 
 *	the user and populate the array with 
 *	the input from the user
 * 
 **/

public class Populate_Array {
	static String names[] = {"", "", "", "", "Bob", "", "", "", "", ""};
	
	public static void main(String[] args){
		println("Enter a name to populate the array.");
		Scanner input = new Scanner(System.in);
		String input_string = input.next();
		
		for(int i = 0; i < names.length; i++){
			if(names[i].isEmpty()){
				names[i] = input_string;
			}
		}
		println("Final Array:");
		for(String name : names){
			println(name);
		}
	}// End of main method
	
	public static void print(String input){
		System.out.print(input);
	}// End of print
	
	public static void println(String input){
		System.out.println(input);
	}// End of println
}// End of Class
