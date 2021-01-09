

class Main
{
	public static void main(String ar[])
{
	ABC a1  = new ABC();
try
{	

a1.details(Integer.parseInt(ar[0]) , Integer.parseInt(ar[1]));	
a1.show();
}

catch(Exception ex)
{
	a1.show();
//	System.out.println(ex.getMessage());
//System.out.println(ex);
ex.printStackTrace();
}



	
}
}
class ABC 

{
	int a = 0;
	int b = 0;
	public void details(int a , int b)
	{
		int c = a/b;
		System.out.println("a = "+a);
	}
	
	public void show()
	{
		System.out.println("I am In Show");
	}
	
	
	
	
	
}




 

	


