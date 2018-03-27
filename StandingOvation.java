import java.io.*;
import java.util.*;
public class StandingOvation{
	public static void main(String arg[]){
		new StandingOvation();
	}
	
	public StandingOvation(){
		Scanner miScanner = new Scanner(System.in);
		
		System.out.print("Tests: ");
		int tests = Integer.parseInt(miScanner.nextLine());
		
		for(int i=0;i<tests;i++){
			test(i+1);
		}
	}
	
	public void test(int numberOfCase){
		Scanner miScanner2 = new Scanner(System.in);
		System.out.print("input: ");
		String input = miScanner2.nextLine();
		
		
		int Smax = Integer.parseInt(input.charAt(0) + "");
		String people = input.substring(2,input.length());
		
		if(Smax!=people.length()-1){
			System.out.println("Invalid data!");
			return;
		}
		
		int standingPeople = 0;
		int invited = 0;
		
		for(int i=0;i<people.length();i++){
			//System.out.println("Shyness lvl: "+i);
			int numberOfPeople = Integer.parseInt(people.charAt(i)+"");
			
			//System.out.println("people: "+numberOfPeople);
			//System.out.println("standing people: "+standingPeople);
			
			if(numberOfPeople>0){
				if(i<=standingPeople){
					//System.out.println("Se levantan "+numberOfPeople);
					standingPeople += numberOfPeople;
				}
				else{
					invited += i-standingPeople;
					//System.out.println("Invito a "+(i-standingPeople));
					//System.out.println("Se levantan "+(numberOfPeople+i-standingPeople));
					standingPeople += numberOfPeople+i-standingPeople;
				}
			}
				
			//System.out.println("===================");
		}
		
		System.out.println("Case #"+numberOfCase+": "+invited+"\n");
	}
}