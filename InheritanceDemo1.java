//Method Overloading

class Main
{
	public static void main(String ar[])
{
	PQR p1  = new PQR();
	p1.dispaly(10);
	
	
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
	void dispaly(int a)
	{
		super.dispaly(a);
		System.out.println("a = "+a);
	}
}
