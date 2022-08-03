package Assign;


	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.Scanner;

	public class FileOperations {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s=sc.nextLine();
			
			char[] arr=new char[100];
			
			try{
			FileWriter file=new FileWriter("OpenNewFile.txt");
			
			file.write(s);
			System.out.println("Data is written in the file");
			
			file.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			finally{
			try{
			FileReader file1=new FileReader("OpenNewFile.txt");
			
			file1.read(arr);
			System.out.println(arr);
			System.out.println("After read content from the file");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
				
			}
			
		}

	}



