// Collection of Similar types of objects
//Generic Arraylist
//ConcurrentHashMap 


import java.util.*;




class MapDemo1{
	
		public static void main(String ar[])
		{
System.out.println("\n--------------------Hash Map---------------------------");	// Non-Syncronized		
LinkedHashMap map = new LinkedHashMap();
map.put("name" , "Aman");
map.put("roll" , "102");
map.put("address" , "Delhi");
map.put("name" , "raj");
map.put(null , "raj");
System.out.println(map);
//System.out.println(map.get("roll"));

System.out.println("\n--------------------Hash Table-------------------------"); // Syncronized
Hashtable htable  = new Hashtable();
htable.put("name" , "Aman");
htable.put("roll" , "102");
htable.put("address" , "Delhi");
htable.put("name" , "raj");
//htable.put(null , "raj");                // we can not used null key in Hash Table
System.out.println(htable);

}



}