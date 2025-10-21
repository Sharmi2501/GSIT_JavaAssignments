package conditionalstatements;

public class ConditionalStatementAssignment2 {

	public static void main(String[] args) {
		int Math = 55;
		int Science = 55;
		int English = 68;
		
		int total = Math+Science+English;
		
		double average = total/3.0;
		
		System.out.println("Maths marks :" + Math);
		System.out.println("Science marks :" + Science);
		System.out.println("English marks :" + English);
		System.out.println("Total marks :" +total);
		System.out.println("Average marks :" + average);
		
		
		
		 if (Math < 35 || Science < 35 || English < 35) {
	            System.out.println("Failed due to low score in at least one subject.");
	        } else {
        String grade;
        if (average >= 90 && average <= 100) {
            grade = "A+";
        } else if (average >= 75) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
     
       
        
        if(grade.equals("Fail"))
        {
        	System.out.println("Please work harder next time.");
        }
        else if(grade.equals("A+")||(grade.equals("A")))  
        {
        	System.out.println("Excellent Performance");
        }
        else
        {
        	System.out.println("Keep improving");
        }
        
        
    
	        }}
	}

	


