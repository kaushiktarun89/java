// what happen if we print the object of the class : it calls the toString Method of base class . it prints Classname + @ + Hashcode.


class Main
{
	public static void main(String ar[])
{
	Demo demo = new Demo();
	System.out.println("a = "+demo.a);
	System.out.println("demo object = "+demo);
	
	
	
}
}


 
class Demo{
int a = 5;

public String toString()
{
	return "Hello i am in Demo";
}



}
