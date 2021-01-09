// what happen if we print the object of the class : it calls the toString Method of base class . it prints Classname + @ + Hashcode.


class Main
{
	public static void main(String ar[])
{
	FunctinDemo2 demo = new FunctinDemo2();
    double a = demo.calculation(Integer.parseInt(ar[0]));
 System.out.println("area of Circle = "+a*Integer.parseInt(ar[0]));  
 System.out.println("Cirumfrence of Circle = "+a*2);  
}
}


 
class FunctinDemo2{


void circleArea(int radius)
{
double ar = 3.14 * radius *radius;
System.out.println("area = "+ar);	

}

double calculation(int radius)
{

double a = 3.14*radius;
return 	a;
}

}
