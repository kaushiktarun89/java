//Method Overloading

class Main
{
	public static void main(String ar[])
{
	FunctinDemo5 demo = new FunctinDemo5();
	new FunctinDemo5("Rahul");
    
}
}


 
class FunctinDemo5{



FunctinDemo5()
{

System.out.println("Default Constructor");  
}

FunctinDemo5(String Name)
{

System.out.println("Parametrized Constructor = "+Name);  
}


}
