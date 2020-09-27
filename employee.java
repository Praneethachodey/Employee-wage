public class employee{

public static void main(String args[])
{
	System.out.println("Welcome to employee wage problem");
	int IS_FULL_TIME=1;
	int EMP_RATE_PER_HOUR=20;

	int empHrs=0;
        int empwage=0; 
	
	double empCheck = Math.floor(Math.random()*10)%2;
	if(empCheck==IS_FULL_TIME)
		{
		System.out.println("Employee is present");
		empHrs=8;
		}
		

	else
		System.out.println("Employee is absent");

	empwage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("employee wage is " + empwage);
}
}