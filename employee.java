public class employee{
	public static final int IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int IS_PART_TIME=2;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_A_MONTH=100;
public static void main(String args[])
{
	System.out.println("Welcome to employee wage problem");
	int total=0;
 	int totalEmpHrs=0;
        int totalWorkingDays=0;
	
	while(totalEmpHrs<MAX_HRS_IN_A_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
	{
		double empCheck = Math.floor(Math.random()*10)%3;
		totalWorkingDays++;
		int empHrs=0;
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

		int empwage=empHrs*EMP_RATE_PER_HOUR;
		totalEmpHrs+=empHrs;
       		total+= empwage;
		System.out.println("employee wage is " + empwage);
	}
	System.out.println("total employee wage is : " + total);
}
}