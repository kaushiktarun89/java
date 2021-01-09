class VariablesDemo{

public static void main(String ar[])
{
// Variable Syntax
// Datatype Variable Name = value;

String studentName = "Rahul";

System.out.println("Student Name = " + studentName);

int studentAge = 20;
System.out.println("Student Age = "+studentAge);

int student_Fees$ = 1000;
System.out.println("Student Fees = "+student_Fees$);

String studentPhone5 = "7845123698";
System.out.println("Student Phone  = "+studentPhone5);


int _123 = 234;
System.out.println("_123  = "+_123);


boolean isMale = true;
System.out.println("Gender Male  = "+isMale);


char classSection = '1';  // Char value always pass in single quotes.
System.out.println("classSection  = "+classSection);

int studentClass= 5;
System.out.println("class  = "+studentClass);

float f = 1.2f;
System.out.println("f  = "+f);

double d = 1.1234567; 
System.out.println("d  = "+d);

double pi = 3.14;
int r = 2;

double area = pi* r*r;
System.out.println("Area of circle  = "+area);

byte bt = (byte)129; // Type casting
System.out.println("byte  = "+bt);

byte bt1 = 5;

int i = bt1; // type Conversion
System.out.println("int  = "+i);


Integer a1 = 10;
System.out.println("integer  = "+a1);

System.out.println("MIN_VALUE  = "+Byte.MIN_VALUE);



}
}