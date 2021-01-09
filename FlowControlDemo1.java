class FlowControlDemo1
{


public static void main(String ar[])
{
  
if(ar.length==0)
{
System.out.println("Enter the value at run time");
}
else{
 
String user = ar[0];

if(user.equals("") || user == null)
{
System.out.println("Fill the values");
}
else if(user.equals("admin"))
{
System.out.println("Welcome User ");
}
else if(!user.equals("admin"))
{
System.out.println("Invalid User");
}
}
}



}