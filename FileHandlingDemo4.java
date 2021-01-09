import java.io.*;

class FileHandlingDemo4
{
	public static void main(String ar[]) 
	{
		try
		{
	      File ff = new File("PackageDemo1.txt");	
		  System.out.println(ff.exists());
		  if(ff.exists())
		  {
		  ff.delete();
		  System.out.println("File deleted sucessfully");
		  }
		  else{
			  System.out.println("File Not Found");
		  }
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception  = "+ex);
			
		}
	}
	
	
}

