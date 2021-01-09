//Method Overloading

package p1;

class Main
{
	public static void main(String ar[])
{
	PQR a1  = new PQR();
	
	a1.show();
	a1.display();
	
	
	
}
}

interface ABC 
{
	
	int a = 9;
	void display();
	
	
}


interface MNO  extends ABC
{
	
	int b = 9;
	void display();
}

class PQR implements MNO{


static void show()
{    
	System.out.println("a = "+a);
	
}

public void display()
{
	System.out.println("b = "+b);
}


}


 

	


