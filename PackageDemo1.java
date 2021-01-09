
package package1;

import package2.PackageDemo2;
import package3.*;
import package3.package4.*;



class PackageDemo1
{
	public static void main(String ar[])
{
	PackageDemo2 pd2 = new PackageDemo2();
	System.out.println(pd2.a);
	pd2.show();
	ClassDemo cd = new ClassDemo();
	System.out.println(cd.a);
	PackageDemo3 pd3 = new PackageDemo3();
	System.out.println(pd3.a);
	PackageDemo4 pd4 = new PackageDemo4();
	System.out.println(pd4.b);
}
}

 

	


