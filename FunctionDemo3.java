// what happen if we print the object of the class : it calls the toString Method of base class . it prints Classname + @ + Hashcode.


class Main
{
	public static void main(String ar[])
{
	FunctinDemo3 demo = new FunctinDemo3();
    double a = demo.calculation(Integer.parseInt(ar[0]));
 System.out.println("area of Circle = "+a*Integer.parseInt(ar[0]));  
 System.out.println("Cirumfrence of Circle = "+a*2);  
}
}


 
class FunctinDemo3{



double calculation(int radius)
{
double a = 3.14*radius;
return 	a;
}

}
