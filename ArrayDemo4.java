class ArrayDemo4{

public static void main(String ar[])
{

int arr[][] = new int[3][3];
int k = 0;
for(int r=0; r<3;r++)
{
for(int c=0; c<3;c++)
{
	System.out.println("enter the Array values");
   arr[r][c] = Integer.parseInt(ar[k]);
    k++;
}
}




for(int r=0; r<3;r++)
{
System.out.println();
for(int c=0; c<3;c++)
{

System.out.print(arr[r][c]+"   ");
}
System.out.println();
}
}



}