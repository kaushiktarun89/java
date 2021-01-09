//Method Overloading

class Main
{
	public static void main(String ar[])
{
	ThisDemo demo = new ThisDemo();
	demo.calculation(10);
	demo.details();    
}
}


 
class ThisDemo{

int radius;
double area;
final double pi = 3.14;


void calculation(int radius)
{
this.radius = radius;	
area = pi * radius *radius;
	
}
void details()
{
	System.out.println("Radius = "+radius);
	System.out.println("Area = "+area);
}

}
