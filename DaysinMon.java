public class DaysinMon 
{
	public static void main (String[] args)
	{	
		int i_mon_v = Integer.parseInt(args[0]);
		int i_yr_v = Integer.parseInt(args[1]);
        switch (i_mon_v) {
        case 1:  System.out.println("No of Days in Jan :31"); break;
        case 2:
        	if (i_yr_v%4==0)
        	{
        		System.out.println("No of Days in Feb :29");
        	}  
        	else
        	{
        		System.out.println("No of Days in Feb :28");
        	}	
        	break;
        case 3:  System.out.println("No of Days in Mar :31"); break;
        case 4:  System.out.println("No of Days in Apr :30"); break;
        case 5:  System.out.println("No of Days in May :31"); break;
        case 6:  System.out.println("No of Days in Jun :30"); break;
        case 7:  System.out.println("No of Days in Jul :31"); break;
        case 8:  System.out.println("No of Days in Aug :31"); break;
        case 9:  System.out.println("No of Days in Sep :30"); break;
        case 10: System.out.println("No of Days in Oct :31"); break;
        case 11: System.out.println("No of Days in Nov :30"); break;
        case 12: System.out.println("No of Days in Dec :31"); break;
        default: System.out.println("Invalid month.");break;
    }
		
	}
}