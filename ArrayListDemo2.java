// Collection of Similar types of objects
//Generic Arraylist

import java.util.*;


class ArrayListDemo2{
	
		public static void main(String ar[])
		{

Integer i1 = new Integer(5);
Integer i2 = 4;
String s1 = "kamal";
String s2 = new String("Hello");




ArrayList<String> alist = new ArrayList<String>();


alist.add(1,s1);  // add object at particular index.
alist.add(s2);
alist.add("How are you");

System.out.println(alist);

for(int i=0 ; i<alist.size();i++)
{
	
	//System.out.println(alist.get(i));
	
	
}

if(alist.isEmpty())
{
	System.out.println("Arraylist is blank");
}


alist.remove(s2);  // remove the object value
alist.remove(0);    // remove the index value
System.out.println(alist);

alist.clear();
System.out.println(alist);





}



}