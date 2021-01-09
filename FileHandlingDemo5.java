
import java.io.*;
import java.util.*;
 
 class FileHandlingDemo5
 {
	 public static void main(String ar[])
	 {
    try
    {
        File f1 = new File("printwriter.txt");
		InputStreamReader isr = new InputStreamReader(System.in);
		
		
     	FileWriter fw = new FileWriter(f1);
		BufferedReader br = new BufferedReader(isr);
		
		PrintWriter pw = new PrintWriter(fw);
	
	
	    System.out.println("Enter your Name");
		String name = br.readLine();
		System.out.println("Enter your Age");
		String age = br.readLine();
		pw.printf(name,age);
		pw.close();
		
     }


    catch(Exception ex) 
		{
			System.out.println("Exception  = "+ex);
			
		}
			/*int a =0;	
	FileInputStream fis = new FileInputStream("printwrite.txt");
         while((a = fis.read())!=-1)
		 {
			 System.out.print((char)a);
			 
		 }*/
		 
 }
 }

