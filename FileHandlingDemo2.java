import java.io.*;

class FileHandlingDemo2
{
	public static void main(String ar[]) 
	{
		try
		{
		int a =0;	
	FileInputStream fis = new FileInputStream("PackageDemo1.java");
         while((a = fis.read())!=-1)
		 {
			 System.out.print((char)a);
			 
		 }
		 
		 
           fis.close();

	/*
	FileReader fr = new FileReader("PackageDemo4.java");	
	while((a = fr.read())!=-1)
		 {
			 System.out.print((char)a);
			 
		 }
		
		*/
		
		
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception  = "+ex);
			
		}
	}
	
	
}

