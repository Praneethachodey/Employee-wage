public class employee{

public static void main(String args[])
{
	System.out.println("Welcome to employee wage problem");
	int IS_FULL_TIME=1;
	int EMP_RATE_PER_HOUR=20;
	int IS_PART_TIME=2;

	int empHrs=0;
        int empwage=0; 
	
	double empCheck = Math.floor(Math.random()*10)%3;
	if(empCheck==IS_FULL_TIME)
		{
		System.out.println("Employee is present-full time");
		empHrs=8;
		}
	else if(empCheck==IS_PART_TIME)
		{
		System.out.println("Employee is present-part time");
		empHrs=4;
		}
		

	else
		System.out.println("Employee is absent");

	empwage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("employee wage is " + empwage);
}
}