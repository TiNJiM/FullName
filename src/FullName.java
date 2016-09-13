import java.io.*;
import java.util.*;
public class FullName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner (System.in);
		System.out.print ("What is your first name? ");
		String fName = kbReader.nextLine();
		System.out.print ("What is your last name? ");
		String lName = kbReader.nextLine();
		System.out.println ("Your full name is " + fName + " " + lName + ".");
	}

}
