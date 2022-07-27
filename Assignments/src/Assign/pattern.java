package Assign;

import java.util.regex.*;

public class pattern {
	public static void main(String[] args){
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("ps");
		boolean b = m.matches();
		
		if(b)
			System.out.println("The input matches the pattern");
		else
			System.out.println("The input Not matches the pattern");
		
		Pattern p2 = Pattern.compile(".*\\s+.*");
		Matcher m2 = p2.matcher("Ajey   dev");
		boolean b2 = m2.matches();
		if(b2)
			System.out.println("The input matches the pattern");
		else
			System.out.println("The input Not matches the pattern");
		
		//Pattern p3 = Pattern.compile(".*\\d.*");
		Pattern p3 = Pattern.compile(".*@{1}.*");
		Matcher m3 = p3.matcher("ajey@dev");
		boolean b3 = m3.matches();
		if(b3)
			System.out.println("The input matches the pattern");
		else
			System.out.println("The input Not matches the pattern");
	}
}


	
	
	

