
public class Recursion_adv4 {
//Q-> Find number of ways in which you can invite n people to your party single, or in pairs
	
	public static int callGuest(int n) {
		if(n<=1) {
			return 1;
		}
		
		// Single entry
		int ways1 = callGuest(n-1);
		
		// pairs entry
		int ways2 = (n-1)*callGuest(n-2);
		
		return ways1+ways2;
	}
	
	public static void main(String[]args) {
		int n = 4;
		System.out.println("Ways to Call Guests: "+callGuest(n));
	}
	
}