import java.io.*;

class FileHandlingDemo3
{
	public static void main(String ar[]) 
	{
		try
		{
		/*int a =0;	
		FileInputStream fis = new FileInputStream("PackageDemo1.java");
		FileOutputStream fos = new FileOutputStream("PackageDemo1.txt");
         while((a = fis.read())!=-1)
		 {
			 fos.write(a);
			 
		 }
		 
		 
           fis.close();
           fos.close();*/

	FileReader fr = new FileReader("PackageDemo4.java");	
    FileWriter fw = new FileWriter("PackageDemo4.docx");
	while((a = fr.read())!=-1)
		 {
			fw.write(a);
			 
		 }
		 fr.close();
		 fw.close();
		
		
		
		
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception  = "+ex);
			
		}
	}
	
	
}

