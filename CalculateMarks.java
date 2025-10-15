package firstpackage;

public class CalculateMarks {
	public static void main(String[] args)
	{
		int Math = 95;
		int Science = 85;
		int English = 88;
		
		int total = Math+Science+English;
		
		double average = total/3.0;
		
		System.out.println("Maths marks :" + Math);
		System.out.println("Science marks :" + Science);
		System.out.println("English marks :" + English);
		System.out.println("Total marks :" +total);
		System.out.println("Average marks using double :" + average);
		
		int avgInt = total/3;
		System.out.println("Average marks using Int :" +avgInt);
		
		
		
		
	}

}
