// what happen if we print the object of the class : it calls the toString Method of base class . it prints Classname + @ + Hashcode.


class Main
{
	public static void main(String ar[])
{
	Demo demo = new Demo();
	System.out.println("a = "+demo.a);
	demo.calculator();
int b = demo.isArea();
System.out.println(demo.Name());
	
}
}


 
class Demo{
int a = 5;

void calculator()
{
	System.out.println("Default Function with void return type.");
}

int isArea()
{
double ar = 3.14 * 10 *10;
System.out.println(ar);	
return a; 	
}

String Name()
{
return "I am in Name Function"; 	
}


}
