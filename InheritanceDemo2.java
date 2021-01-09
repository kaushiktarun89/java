//Method Overloading

class Main
{
	public static void main(String ar[])
{
	PQR p1  = new PQR();
	MNO m1  = new MNO();
	p1.dispaly(10);
	System.out.println("====================================");
	m1.dispaly(10);
	
	
}
}


 
class ABC{

int a = 0;
void dispaly(int b)
{
	a = b;
	System.out.println("I am in ABC Class");
}
}

class PQR extends ABC
{
	String Name = "Aman";
	void dispaly(int a)
	{
		super.dispaly(a);
		System.out.println("a = "+a);
		System.out.println("Name = "+Name);
	}
}
class MNO extends ABC
{
	void dispaly(int a)
	{
		super.dispaly(a);
		System.out.println("a = "+a);
		
	}
}