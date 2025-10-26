package problemstatements;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 121;
		
		int originalNum =num;
		
		int rev=0;
		
		while(num!=0)
		{
			int digit = num % 10;
			rev=rev*10+digit;
			num=num/10;
		
		}
		
		if(originalNum == rev)
		{
			System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        
		}

	}

}
