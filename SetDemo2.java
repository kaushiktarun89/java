// Collection of Similar types of objects
//Generic Arraylist

import java.util.*;


class SetDemo2{
	
		public static void main(String ar[])
		{


String s1 = "kamal";
String s2 = new String("Aman");




HashSet<String> tset = new HashSet<String>();


tset.add(s1);  // add object at particular index.
tset.add(s2);
tset.add("tarun");
tset.add("amit");

System.out.println(tset);

for(int i=0 ; i<tset.size();i++)
{
	
	//System.out.println(tset.get(i));
	
	
}

if(tset.isEmpty())
{
	System.out.println("Arraylist is blank");
}


tset.remove(s2);  // remove the object value
System.out.println(tset);

tset.clear();
System.out.println(tset);
System.out.println("===================================================");

HashSet<Integer> tset1 = new HashSet<Integer>();
tset1.add(121);
tset1.add(1);
tset1.add(11);
tset1.add(21);
tset1.add(12);
tset1.add(1);
tset1.add(10);
tset1.add(110);
System.out.println("Integer type SET "+tset1);



System.out.println("===================================================");

HashSet<String> tset2 = new HashSet<String>();
tset2.add("121");
tset2.add("1");
tset2.add("11");
tset2.add("21");
tset2.add("12");
tset2.add("1");
tset2.add("10");
tset2.add("110");
System.out.println("String type SET "+tset2);



}



}