import   java.util.Scanner;
class  Assignment
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the  first number:");
		int m1=sc.nextInt();
		System.out.println(" Enter the  second number:");
		int m2=sc.nextInt();	
		System.out.println(" Enter the  third number:");
		int m3=sc.nextInt();
       System.out.println(" Enter the   fourth number:");
		int m4=sc.nextInt();
       System.out.println(" Enter the  fifth  number:");
		int m5=sc.nextInt();
       System.out.println(" Enter the  sixth number:");
		int m6=sc.nextInt();
		 int total=m1+m2+m3+m4+m5+m6;
	    System.out.println(total);
		float avg=(float)total/6;
		if(avg>=70)
		System.out.println("A grade");
		else if(avg>=50)
        System.out.println("B grade");
		else if(avg>=35)
		  System.out.println("C grade");
		else
		        System.out.println("failed");


	}
}








