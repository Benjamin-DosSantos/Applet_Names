import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;

/** 
 * 
 *	Name: Benjamin DosSantos 
 *	Assignment: Name Display
 *	Project Description:  This program is intended 
 *  to display the contents of the arrays using 
 *  applets and the graphics system in Java 
 * 
 **/

@SuppressWarnings("serial")
public class Name_Display extends Applet{
	
	int applet_width = 1000, 
		applet_height = 1000,
		string_xPos = 0,
		string_yPos = 0;
	
	String names[] = {"Jeannette", "Jordan", "Jerome", "Nina", "Ramona", "Frankie", "Elvira", "Fredrick", "Willie"};
	String allNames = "";
	
	Random ran = new Random();
	
	public void init(){
		this.setSize(applet_width, applet_height);
	}
	
	public void paint(Graphics g){
		for(int i = 0; i < names.length; i++){
			string_xPos = ran.nextInt(applet_width);
			string_yPos = ran.nextInt(applet_height);
			g.drawString(names[i], string_xPos, string_yPos);
			allNames += names[i] + " ";
		}// End of for names
		string_xPos = ran.nextInt(applet_width);
		string_yPos = ran.nextInt(applet_height);
		g.drawString(allNames, string_xPos, string_yPos);
	}// End of paint
}// End of class
