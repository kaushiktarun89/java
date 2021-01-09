class ArrayDemo2{

public static void main(String ar[])
{

int arr[] = new int[ar.length];

for(int i=0; i<ar.length;i++)
{
arr[i] = Integer.parseInt(ar[i]);
System.out.println(arr[i]);
}
}



}