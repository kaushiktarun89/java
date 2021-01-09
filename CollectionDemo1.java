// Collection of Similar types of objects
//Generic Arraylist

import java.util.*;

class Student
{
	String Name ;
	String Phone;
	int rno;
	Student(String Name , String Phone , int rno)
	{
		this.Name = Name;
		this.Phone = Phone;
		this.rno = rno;
	}
	
	
	
}



class CollectionDemo2{
	
		public static void main(String ar[])
		{

Student s1 = new Student("Aman" , "1123235454" , 3);
Student s2 = new Student("tarun" , "1123235454" , 4);
Student s3 = new Student("Kamal" , "1123235454" , 1);
Student s4 = new Student("Nisha" , "1123235454" , 7);
Student s5 = new Student("Sukh" , "1123235454" , 8);

ArrayList<Student> studentList = new ArrayList<Student>();
studentList.add(s1);
studentList.add(s2);
studentList.add(s3);
studentList.add(s4);
studentList.add(s5);


System.out.println(studentList);
for(int i = 0 ; i < studentList.size();i++)
{
System.out.println(studentList.get(i).rno +"    " +studentList.get(i).Name);
}









}



}