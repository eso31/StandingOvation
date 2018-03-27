import java.util.*;

public class StandingOvation{
	public static void main(String arg[]){
		new StandingOvation();
	}
	
	public StandingOvation(){
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("Tests: ");
		int tests = Integer.parseInt(myScanner.next());
		
		for(int i=0;i<tests;i++){
			test(i+1);
		}
	}
	
	public void test(int numberOfCase){
		Scanner myScanner2 = new Scanner(System.in);
		//We need two inputs in this point, one to assign the max shyness, and second, the string of levels
		System.out.print("\nEnter shyness max level:");
		int inputMaxShyness = Integer.parseInt(myScanner2.next());
		
		Scanner myScanner3 = new Scanner(System.in);
		System.out.print("\nEnter the ammount of people of each level:");
		String allPeopleByLevel = myScanner3.next();

		if(allPeopleByLevel.length() != inputMaxShyness + 1){
			System.out.println("\\nYou must enter the ammount of people of ALL levels.");
			return;
		}
		
		int standingPeople = 0;
		int invitedPeople = 0;
		int invitedTemp = 0;
		
		//Since there is always a level of Shyness 0, the for loop requires <=
		for(int i = 0; i <= inputMaxShyness; i++){
			//System.out.println("Shyness lvl: "+i);
			int numberByLevel = Integer.parseInt(allPeopleByLevel.charAt(i) + "");
			
			//System.out.println("people: "+numberOfPeople);
			//System.out.println("standing people: "+standingPeople);
			
			//Here, you only need to check if the people stanging are less than the ones required for the level
			//Then, we create a temporal variable to get the required people to invite
			//Finally, we add that variable to both the standing and invited people
			if(standingPeople < i){
				invitedTemp = i - standingPeople;
				standingPeople += invitedTemp;
				invitedPeople += invitedTemp;
			}
			standingPeople += numberByLevel;
			//System.out.println("===================");
		}
		System.out.println("Case #" + numberOfCase + ": " + invitedPeople + "\n");
	}
}