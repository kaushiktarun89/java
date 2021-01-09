// static : keyword used in 3 ways.    
//1. static variable 
//2. static method
//3. static block

 
class Main
{
	public static void main(String ar[])
	{
		StaticDemo1 sd1 = new StaticDemo1();
		System.out.println("--------------------------------------");
		StaticDemo1 sd2 = new StaticDemo1();
		
		System.out.println("a = "+sd1.a);
		System.out.println("b = "+sd1.b);
		System.out.println("a by class name = "+StaticDemo1.a);
		
		
		
		
		
	}
	
	
}	
 
 
class StaticDemo1{

static int a = 1;
int b =1;

StaticDemo1()
{
	System.out.println("Before Increment  a = "+a);
	System.out.println("Before Increment  b = "+b);
	a++;
	b++;
	
	System.out.println("After Increment  a = "+a);
	System.out.println("After Increment  b = "+b);
	
	
}








}
