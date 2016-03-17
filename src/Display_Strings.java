
/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Repeat Names
 *	Project Description:  This program 
 *	is intended to display all the repeated 
 *	names in the name array to the console 
 *	if the names are exactly equal in case to each other
 * 
 **/

public class Display_Strings {
	static String names[] = {"James", "John", "Simon", "Alex", "Alex", "Tim", "Tim", "Sam", "sam", "Max", "Ben", "Phill", "Carl"};
	public static void main(String[] args){
		for(int i = 0; i < names.length; i++){
			String comp_name = names[i];
			for(int n = 0; n < names.length; n++){
				if(n == i){
					break;
				}else if(comp_name.equals(names[n])){
					println(comp_name);
					break;
				}// End of same check
			}// End of for each name in loop
		}// end of for names.length
	}// End of main
	
	public static void print(String input){
		System.out.print(input);
	}// End of print
	
	public static void println(String input){
		System.out.println(input);
	}// End of println
}// End of class
