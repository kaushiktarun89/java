// static : keyword used in 3 ways.    
//1. static variable 
//2. static method
//3. static block


 
 
class StaticDemo2{

static int a = 1;
static int b =1;

public static void main(String ar[])
	{
		StaticDemo2 sd = new StaticDemo2();
		show();
		StaticDemo2.show();
		sd.show();
	}
	

static void show()
{
			System.out.println("a = "+a);
     		System.out.println("b = "+b);

}






}
