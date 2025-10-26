package problemstatements;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 12345;  // change this number to test
        int sum = 0;

        int originalNum = num;  

        while (num != 0) {
            int digit = num % 10;  // extract last digit
            sum =sum+ digit;          // add digit to sum
            num = num / 10;        // remove last digit
        }

        System.out.println("Sum of digits of " + originalNum + " = " + sum);

	}

}
