public class employee{
	public static final int IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int IS_PART_TIME=2;
public static void main(String args[])
{
	System.out.println("Welcome to employee wage problem");
	int empHrs=0;
        int empwage=0; 
	
	double empCheck = Math.floor(Math.random()*10)%3;
	switch((int)empCheck)
	{
        case IS_FULL_TIME:
		System.out.println("Employee is present-full time");
		empHrs=8;
		break;
	
	case IS_PART_TIME:
		System.out.println("Employee is present-part time");
		empHrs=4;
		break;
		
	default:
		System.out.println("Employee is absent");
	}

	empwage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("employee wage is " + empwage);
}
}