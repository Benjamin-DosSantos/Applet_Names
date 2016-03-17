import java.util.Scanner;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Name Input Case
 *	Project Description:  This program is 
 *  intended to get an input from the user 
 *  in the form of a string and check the 
 *  array to see if there is a name that is 
 *  exactly equal in case to the name in the 
 *  array. If there is a name equal to the input 
 *  then the console will print out that there 
 *  is a name, if there is no name then the console
 *  will print out that there is no name. 
 * 
 **/

public class Application_Name_Input {
	
	static String names[] = {"James", "John", "Simon", "Alex", "Tim", "Sam", "Max", "Ben", "Phill", "Carl"};

	static boolean has_found_name = false;
	
	public static void main(String[] args){
		println("Enter a name to check the database.");
		Scanner input = new Scanner(System.in);
		String input_string = input.next();
		for(int i = 0; i < names.length; i++){
			if(input_string.equals(names[i])){
				println("The name " + input_string +" is in the database.");
				has_found_name = true;
			}else if(i == names.length - 1 && has_found_name == false){
				println("The name " + input_string +" is NOT in the database.");
			}// End of if last run 
		}// end of for names length
	}// End of main method
	
	public static void print(String input){
		System.out.print(input);
	}// End of print
	
	public static void println(String input){
		System.out.println(input);
	}// End of println
}// End of class
