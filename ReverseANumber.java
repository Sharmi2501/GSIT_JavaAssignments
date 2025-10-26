package problemstatements;

public class ReverseANumber {

	public static void main(String[] args) {
	
		int num=46789; 
		int rev = 0; 
		
		while(num != 0)
		{
			int dig=num%10; //9 8 7 6 4
			rev=rev*10+dig; //9 90+8 98
			num=num/10; //4678 467 46 4
		}
		
		System.out.println(rev);
	}

}
