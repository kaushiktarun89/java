// static : keyword used in 3 ways.    
//1. static variable 
//2. static method
//3. static block


class main{
public static void main(String ar[])
	{
		StaticDemo4 s4 = new StaticDemo4();
		System.out.println("==========================================");
		StaticDemo4 s5 = new StaticDemo4();
	}

}	
 
class StaticDemo4{

StaticDemo4()
{
	System.out.println("I am in constructor");
}

	
	
static
{
	System.out.println("I am in static block");
}


{
	System.out.println("I am in non static block");
}

	

}
