/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void sun(){
		System.out.println("  \\|/");
		System.out.println(" --o--");
		System.out.println("  /|\\");
	}
	
	public static void bird(){
		System.out.print("<o^ \n");
		System.out.println(" ea \n");
	}
	
	public static void cloud(){
		System.out.println("\t\t  ooooooooooo");
		System.out.println("\t\t ooooooooooooo");
		System.out.println("\t\tooooooooooooooo");
		System.out.println("\t\t  oooooooooo");
	}
	
	public static void tree(){
		System.out.println("\t    *****");
		System.out.println("\t  ********");
		System.out.println("\t **********");
		System.out.println("\t*************");
		System.out.println("\t*************");
		System.out.println("\t **********");
		System.out.println("\t     ||| *");
		System.out.println("\t     |||/");
		System.out.println("\t     |||");
	}
	
	public static void explanation() {
		System.out.println("\n This is a tree with a bird, a cloud, and the sun above it.");
	}
	public static void main (String [] args) {
		sun();
		cloud();
		bird();
		tree();
		explanation();
		
	}
}