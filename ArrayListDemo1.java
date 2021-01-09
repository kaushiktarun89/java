// Collection of Diffrent types of objects

import java.util.*;


class ArrayListDemo1{
	
		public static void main(String ar[])
		{

Integer i1 = new Integer(5);
Integer i2 = 4;
String s1 = "kamal";
String s2 = new String("Hello");




//ArrayList alist = new ArrayList();
LinkedList alist = new LinkedList();
alist.add(i1);    // add object in arraylist
alist.add(i2);
alist.add(1,s1);  // add object at particular index.
alist.add(s2);
alist.add("How are you");
alist.add(new Double(1.23));

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