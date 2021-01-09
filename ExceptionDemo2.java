

class ExceptionDemo2
{
	public static void main(String ar[]) 
	{
		try
		{
		
		int age = Integer.parseInt(ar[0]);
		
		
		if(age<18)
		{
			throw new ABC();
		}
		else
			{
		System.out.println("age = "+age);		
			}
		
		
		
		
		
		}
		catch(Exception ex)
		{
			System.out.println("Exception  = "+ex);
			
		}
		finally
		{
			System.out.println("I am in final block");	
			
		}
		
		
		
		
	}
	
	
	
	
	
}
class ABC extends Exception
{
	ABC()
	{
		System.out.println("Under Age Exception");
	}
	
}




 

	


