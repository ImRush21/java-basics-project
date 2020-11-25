package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hungry=false;
			if(hungry)
			{
				System.out.println("Im starving");	
			}
			else
			{
				System.out.println("Im not hungry");
			}
				
			int  hungerRate=5;
			if(!(hungerRate<6))
			{
				System.out.println("Not hungry");
			}
			else
			{
				System.out.println("I'm starving");	
			}
				
			int favTemp=70;
			int currTemp=60;
			String opinion;
			
			if(currTemp < favTemp-30)
			{
				opinion="Its cold";	
			}
			else if(currTemp < favTemp-20)
			{
				opinion="Its kinda cold out";
			}
			else if(currTemp > favTemp+10)
			{
				opinion="Its kinda hot";
			}
			else
			{
				opinion="Beautiful dayyyy";
			}
			System.out.println(opinion);
			
			int month=4;
			String monthString;
			
			switch(month)
			{
			case 1:
				monthString="January";
				break;
				
			case 2:
				monthString="february";
				break;
			case 3:
				monthString="march";
				break;
			case 4:
				monthString="April";
				break;
			default:
				monthString="invalid month";
				break;
			}
			System.out.println(monthString);
	}

}
