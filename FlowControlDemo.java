class FlowControlDemo
{


public static void main(String ar[])
{
   int a = Integer.parseInt(ar[0]);
String user = ar[1];

if(user.equals(""))
{
System.out.println("Fill the values");
}
if(user.equals("admin"))
{
System.out.println("Welcome User ");
}
if(!user.equals("admin"))
{
System.out.println("Invalid User");
}


if(a%2==0)
{
System.out.println("a is even= "+a);
}

  else
{
System.out.println("a is odd= "+a);
} 







}



}