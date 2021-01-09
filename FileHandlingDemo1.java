import java.io.*;

class FileHandlingDemo1
{
	public static void main(String ar[]) 
	{
		try
		{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter your Name");
		String Name = br.readLine();
		System.out.println("Enter your Age");
		String Age = br.readLine();
		System.out.println("---------------------------------------------------");
		System.out.println("Student Details");
		System.out.println("---------------------------------------------------");
		System.out.println("Name = "+Name);
		System.out.println("Age = "+Age);
		
		
		
		
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception  = "+ex);
			
		}
	}
	
	
}

