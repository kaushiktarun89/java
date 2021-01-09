//Method Overloading

class Main
{
	public static void main(String ar[])
{
	FunctinDemo4 demo = new FunctinDemo4();
    demo.area(Integer.parseInt(ar[0]),Integer.parseInt(ar[1]));
	demo.area(Integer.parseInt(ar[0]));
	demo.area(Double.parseDouble(ar[0]));

}
}


 
class FunctinDemo4{



void area(int length , int breadth)
{
int ar = length*breadth;
System.out.println("area of rectangle = "+ar);  
}

void area(int radius)
{
double ar = 3.14*radius*radius;
System.out.println("area of circle = "+ar);  
}

void area(double side)
{
double ar = side*side;
System.out.println("area of square = "+ar);  
}

double area(double side)
{
double ar = side*side;
System.out.println("area of square = "+ar);  
return ar;
}

}
