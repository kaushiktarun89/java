//Method Overloading

class Main
{
	public static void main(String ar[])
{
	PQR p1  = new PQR();
	System.out.println(p1);
	
	
}
}


 


class PQR 
{
	String Name = "Aman";
	public String toString()
	{
		
		System.out.println(super.toString());
		return Name;
	}
}
